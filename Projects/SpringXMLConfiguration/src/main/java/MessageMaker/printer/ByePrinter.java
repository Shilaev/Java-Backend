package MessageMaker.printer;

public class ByePrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println("Bye, " + s);
    }
}
