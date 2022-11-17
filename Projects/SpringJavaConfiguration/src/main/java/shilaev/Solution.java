package shilaev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class Solution {
    @GetMapping("/hello")
    public String hello() {
        return "/hello";
    }

    @GetMapping("/index")
    public String index() {
        return "/index";
    }
}
