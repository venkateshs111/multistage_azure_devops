package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.color:blue}")
    private String color;

    @GetMapping("/")
    public String home() {
        return "<html><body style='background-color:" + color + "; text-align:center;'>" +
               "<h1>Spring Boot Hello World</h1>" +
               "<h2>Color: " + color + "</h2>" +
               "</body></html>";
    }
}
