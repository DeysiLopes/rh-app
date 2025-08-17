package com.deysi.rh_app.adapters.in.controller;

import com.deysi.rh_app.adapters.in.controller.request.position.CreatePositionRequest;
import com.deysi.rh_app.adapters.in.controller.response.PositionResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Testcontainers
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class PositionControllerIT {

    @Container
    @ServiceConnection
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:16-alpine");

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldCreatePositionWhenGivenValidData(){
        var request = new CreatePositionRequest("Desenvolvedor Java", "Senior");

        ResponseEntity<PositionResponse> response = restTemplate.postForEntity("/positions", request, PositionResponse.class);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
        assertNotNull(response.getBody().getId());
        assertEquals("Desenvolvedor Java", response.getBody().getTitle());
        assertEquals("Sênior", response.getBody().getLevel());

    }
    @Test
    void shouldReturnBadRequestWhenGivenInvalidData() {

        var request = new CreatePositionRequest("", ""); // Título e Nível em branco


        ResponseEntity<String> response = restTemplate.postForEntity("/positions", request, String.class);


        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
    }

}
