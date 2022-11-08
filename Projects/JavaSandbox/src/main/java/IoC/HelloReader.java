package IoC;

public class HelloReader implements Reader{
    @Override
    public void print(String s) {
        System.out.println("Hello, " + s);
    }
}
