package shilaev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import shilaev.configuration.SpringConfiguration;
import shilaev.messageMaker.MessageMaker;

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
