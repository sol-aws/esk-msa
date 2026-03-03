package com.example.ordersystem.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public String healthCheck(){
<<<<<<< HEAD
        return "ok";
=======
        return "ok10";
>>>>>>> 9fff4b02dfa373ad95e0bf24cd2037e144cf6dd3
    }
}
