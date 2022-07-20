package JavaSyntaxis.Generics;

class Printer {
    public static <T> void print(T[] items) {
        for (T item : items) System.out.println(item);
    }
}

public class Example3 {
    public static void main(String[] args) {
        Printer.print(
                new String[]{
                        "123123",
                        "1425354",
                        "lkdfjqwef",
                        "ajd;flaksjdf"
                }
        );
    }
}
