package shilaev.messageMaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import shilaev.printer.Printer;

@Component("messageMaker.helloPrinter")
public class MessageMakerHelloPrinter extends MessageMaker {

    @Autowired
    public MessageMakerHelloPrinter(@Qualifier("helloPrinter") Printer printer) {
        super(printer);
    }
}
