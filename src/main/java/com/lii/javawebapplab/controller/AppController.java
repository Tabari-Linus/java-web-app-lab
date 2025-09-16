package com.lii.javawebapplab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
class AppController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("fullName", "Linus Tabari");
        return "index";
    }

    @GetMapping("/health")
    public String health() {
        return "Okay";
    }
}
