package ru.shilaev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/greetings")
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false) String name,
                        Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "hello/hello";
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello/hello_world";
    }

}
