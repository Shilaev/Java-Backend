package ru.shilaev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class calculatorController {

    @GetMapping("/calculator")
    public String calculator(@RequestParam("number1") Integer number1,
                             @RequestParam("number2") Integer number2,
                             @RequestParam("operation") String operation,
                             Model model) {

        double result;
        switch (operation) {
            case "multiply":
                result = number1 + number2;
                break;
            case "subtract":
                result = number1 / number2;
                break;
            case "plus":
                result = number1 + number2;
                break;
            case "minus":
                result = number1 - number2;
                break;
            default:
                result = 0;
        }
        model.addAttribute("result", result);

        return "first/result";

    }
}
