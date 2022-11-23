package shilaev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import shilaev.configuration.SpringConfiguration;
import shilaev.messageMaker.MessageMaker;

//@Controller
//@RequestMapping("/people")
//@Component
public class Solution {
//
//    @GetMapping("/hello")
//    public String hello() {
//        return "/hello";
//    }
//
//    @GetMapping("/index")
//    public String index() {
//        return "/index";
//    }


    static MessageMaker messageMaker;


    public static void Do() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        messageMaker = context.getBean("messageMaker.helloPrinter", MessageMaker.class);
        messageMaker.print("asdfas");
        context.close();
    }

    public static void main(String[] args) {
        Do();
    }
}
