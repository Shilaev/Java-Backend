package shilaev.printer;

import org.springframework.stereotype.Component;

@Component("helloPrinter")
public class HelloPrinter implements Printer{
    @Override
    public void print(String s) {
        System.out.println("Hello, " + s);
    }
}
