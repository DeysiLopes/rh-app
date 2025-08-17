package com.deysi.rh_app.application.core.service.position;

import com.deysi.rh_app.application.core.domain.Position;
import com.deysi.rh_app.application.ports.in.position.CreatePositionCommand;
import com.deysi.rh_app.application.ports.out.position.SavePositionOutputPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CreatePositionServiceTest {
    private SavePositionOutputPort savePort;
    private CreatePositionService service;

    @BeforeEach
    void setUp(){
        savePort = mock(SavePositionOutputPort.class);
        service = new CreatePositionService(savePort);
    }

    @Test
    void shouldCallSavePortWhenGivenValidCommand() throws Exception{
        var command = new CreatePositionCommand("Engenheiro de software", "Pleno");

        service.create(command);

        var captor = ArgumentCaptor.forClass(Position.class);
        verify(savePort, times(1)).savePosition(captor.capture());
        Position captured = captor.getValue();
        assertEquals("Engenheiro de software", captured.getTitle());
        assertEquals("Pleno", captured.getLevel());
    }
    @Test
    void shouldThrowExceptionWhenTitleIsBlank() throws Exception {
        var command = new CreatePositionCommand(" ", "Pleno");
        var exception = assertThrows(IllegalArgumentException.class, () -> {
            service.create(command);
        });
        assertEquals("O titulo e o nivel do cargo nao podem ser nulos ou vazios.", exception.getMessage());
        verify(savePort, never()).savePosition(any(Position.class));
    }

    @Test
    void shouldThrowExceptionWhenLevelIsNull() throws Exception {
        var command = new CreatePositionCommand("Engenheiro de software", null);
        var exception = assertThrows(IllegalArgumentException.class, () -> {
            service.create(command);
        });
        assertEquals("O titulo e o nivel do cargo nao podem ser nulos ou vazios.", exception.getMessage());
        verify(savePort, never()).savePosition(any(Position.class));
    }
}