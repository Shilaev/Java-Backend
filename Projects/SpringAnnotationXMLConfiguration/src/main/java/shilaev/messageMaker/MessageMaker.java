package shilaev.messageMaker;

import org.springframework.beans.factory.annotation.Value;
import shilaev.printer.Printer;

public class MessageMaker {
    String defaultMessage;
    Printer printer;

    public MessageMaker(Printer printer) {
        this.printer = printer;
    }

    public void print(String s) {
        printer.print(s);
    }

    public void print() {
        printer.print(defaultMessage);
    }

    @Value("${MessageMaker.gefaultMessage}")
    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }
}
