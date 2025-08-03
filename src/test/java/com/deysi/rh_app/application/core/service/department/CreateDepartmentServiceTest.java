package com.deysi.rh_app.application.core.service.department;

import com.deysi.rh_app.application.core.domain.Department;
import com.deysi.rh_app.application.ports.in.department.CreateDepartmentCommand;
import com.deysi.rh_app.application.ports.out.department.SaveDepartmentOutputPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CreateDepartmentServiceTest {

    private SaveDepartmentOutputPort savePort;
    private CreateDepartmentService service;

    @BeforeEach
    void setUp() {
        savePort = mock(SaveDepartmentOutputPort.class);
        service = new CreateDepartmentService(savePort);
    }

    @Test
    void shouldCallSavePortWhenGivenValidCommand() throws Exception {
        CreateDepartmentCommand command = new CreateDepartmentCommand("Financeiro", "CC123");
        service.create(command);

        ArgumentCaptor<Department> captor = ArgumentCaptor.forClass(Department.class);
        verify(savePort, times(1)).saveDepartment(captor.capture());
        Department captured = captor.getValue();
        assertEquals("Financeiro", captured.getName());
        assertEquals("CC123", captured.getCostCenterCode());
    }

    @Test
    void shouldThrowExceptionWhenNameIsNull() {
        CreateDepartmentCommand command = new CreateDepartmentCommand(null, "CC123");
        assertThrows(IllegalArgumentException.class, () -> service.create(command));
    }

    @Test
    void shouldThrowExceptionWhenCostCenterCodeIsNull() {
        CreateDepartmentCommand command = new CreateDepartmentCommand("Financeiro", null);
        assertThrows(IllegalArgumentException.class, () -> service.create(command));
    }
}