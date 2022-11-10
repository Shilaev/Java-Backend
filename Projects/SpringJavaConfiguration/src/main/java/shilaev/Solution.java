package shilaev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import shilaev.messageMaker.MessageMaker;

public class Solution {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);

        MessageMaker helloMessage = context.getBean("messageMaker.helloPrinter", MessageMaker.class);
        helloMessage.print();

        MessageMaker byeMessage = context.getBean("messageMaker.byePrinter", MessageMaker.class);
        byeMessage.print();

        context.close();
    }
}
