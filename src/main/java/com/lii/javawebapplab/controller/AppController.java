package com.lii.javawebapplab.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AppController {
    @GetMapping("/")
    public String home() {
        return "<html><body><h1>Full name: Linus Tabari</h1><p>Lab: ECS CICD LAB 1</p></body></html>";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
