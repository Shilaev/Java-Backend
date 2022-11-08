package IoC;

public class ByeReader implements Reader{
    @Override
    public void print(String s) {
        System.out.println("Bye, " + s);
    }
}
