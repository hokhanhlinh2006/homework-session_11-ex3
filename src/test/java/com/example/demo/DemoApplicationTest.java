package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoApplicationTest {

    @Test
    void testGreeting() {
        assertEquals("Hello Spring Boot", DemoApplication.greeting());
    }
}
