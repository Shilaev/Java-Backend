package ru.shilaev.javabootapplication.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Value("${hello}")
    private String hello;

    @GetMapping("/hello")
    public String getHello() {
        System.out.println(hello);
        return "hello";
    }
}
