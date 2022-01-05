package com.example.samplespringboot.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ShapeControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void shouldDrawACircle() {
        assertEquals("This is a circle", testRestTemplate.getForObject("http://localhost:" + port + "/draw/circle", String.class));
    }

    @Test
    public void shouldDrawARectangle() {
        assertEquals("This is a Rectangle", testRestTemplate.getForObject("http://localhost:" + port + "/draw/rectangle", String.class));
    }

    @Test
    public void shouldDrawAPencilByDefault() {
        assertEquals("This is a Pencil", testRestTemplate.getForObject("http://localhost:" + port + "/draw", String.class));
    }

}