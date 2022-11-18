package shilaev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Solution {
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//
//        MessageMaker helloMessage = context.getBean("messageMaker.helloPrinter", MessageMaker.class);
//        helloMessage.print();
//
//        MessageMaker byeMessage = context.getBean("messageMaker.byePrinter", MessageMaker.class);
//        byeMessage.print();
//    }

    @RequestMapping(value = "/hello")
    public String getHello() {
        return "hello";
    }
}
