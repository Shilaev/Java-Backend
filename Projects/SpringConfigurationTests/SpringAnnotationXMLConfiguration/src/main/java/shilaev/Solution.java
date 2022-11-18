package shilaev;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import shilaev.messageMaker.MessageMaker;

public class Solution {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MessageMaker helloMessage = context.getBean("messageMaker.helloPrinter", MessageMaker.class);
        helloMessage.print();

        MessageMaker byeMessage = context.getBean("messageMaker.byePrinter", MessageMaker.class);
        byeMessage.print();

        context.close();
    }
}
