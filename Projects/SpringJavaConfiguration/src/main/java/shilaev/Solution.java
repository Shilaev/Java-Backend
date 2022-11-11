package shilaev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import shilaev.messageMaker.MessageMaker;

@Controller
public class Solution {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(SpringConfiguration.class);
//
//        MessageMaker helloMessage = context.getBean("messageMaker.helloPrinter", MessageMaker.class);
//        helloMessage.print();
//
//        MessageMaker byeMessage = context.getBean("messageMaker.byePrinter", MessageMaker.class);
//        byeMessage.print();
//
//        context.close();
//    }

    @RequestMapping("/hello")
    public String hello(){
        return "/hello";
    }
}
