package shilaev.messageMaker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import shilaev.printer.Printer;

import javax.annotation.PreDestroy;

public class MessageMaker {
    String defaultMessage;
    Printer printer;

    private MessageMaker(Printer printer) {
        this.printer = printer;
    }

    public static MessageMaker getMessageMaker(Printer printer) {
        return new MessageMaker(printer);
    }

    public void print(String s) {
        printer.print(s);
    }

    public void print() {
        printer.print(defaultMessage);
    }

    @Value("${MessageMaker.defaultValue}")
    private void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    @PreDestroy
    private void doMyDestroy(){
        System.out.println("DESTROY");
    }
}
