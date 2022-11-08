package MessageMaker.printer;

public class HelloPrinter implements Printer{
    @Override
    public void print(String s) {
        System.out.println("Hello, " + s);
    }
}
