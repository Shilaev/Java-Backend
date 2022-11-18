package shilaev.messageMaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import shilaev.printer.Printer;

@Component("messageMaker.byePrinter")
public class MessageMakerByePrinter extends MessageMaker {

    @Autowired
    public MessageMakerByePrinter(@Qualifier("byePrinter") Printer printer) {
        super(printer);
    }
}
