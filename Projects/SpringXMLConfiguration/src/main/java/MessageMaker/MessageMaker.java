package printer;

public class ChatPrinter {
    Printer printer;

    public ChatPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(String s) {
        printer.print(s);
    }
}
