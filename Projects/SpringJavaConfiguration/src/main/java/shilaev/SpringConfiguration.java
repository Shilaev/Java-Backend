package shilaev.messageMaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import shilaev.printer.ByePrinter;
import shilaev.printer.HelloPrinter;
import shilaev.printer.Printer;

@Configuration
@ComponentScan("shilaev")
public class SpringConfiguration {

    @Bean("messageMaker")
    @Autowired
    public MessageMaker messageMaker(@Qualifier("helloPrinter") Printer printer) {
        return MessageMaker.getMessageMaker(printer);
    }

    @Bean("helloPrinter")
    public HelloPrinter helloPrinter() {
        return new HelloPrinter();
    }

    @Bean("byePrinter")
    public ByePrinter byePrinter() {
        return new ByePrinter();
    }
}
