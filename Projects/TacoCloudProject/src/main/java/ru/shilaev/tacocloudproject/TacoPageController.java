package ru.shilaev.tacocloudproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TacoPageController {
    @GetMapping("/taco")
    public String getTacoPage() {
        return "taco";
    }
}
