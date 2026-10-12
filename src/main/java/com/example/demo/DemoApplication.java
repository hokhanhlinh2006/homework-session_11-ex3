package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static String greeting() {
        return "Hello Spring Boot";
    }
}
