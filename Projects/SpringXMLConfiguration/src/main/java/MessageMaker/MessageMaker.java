package MessageMaker;

import MessageMaker.printer.Printer;

public class MessageMaker {
    String defaultMessage;
    Printer printer;

    private MessageMaker(Printer printer) {
        this.printer = printer;
    }

    public void print(String s) {
        printer.print(s);
    }

    public void print(){
        printer.print(defaultMessage);
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }
}
