// src/test/java/com/deysi/rh_app/adapters/in/controller/DepartmentControllerIT.java
package com.deysi.rh_app.adapters.in.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Import(TestcontainersConfiguration.class)
class DepartmentControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateDepartmentSuccessfully() throws Exception {
        String departmentJson = """
                {
                    "name": "Recursos Humanos",
                    "costCenterCode": "RH-456"
                }
            """;

        mockMvc.perform(post("/departments")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(departmentJson))
                .andExpect(status().isCreated())
                .andExpect(header().doesNotExist("Location"));
    }
}