package shilaev.printer;

import org.springframework.stereotype.Component;

@Component("byePrinter")
public class ByePrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println("Bye, " + s);
    }
}
