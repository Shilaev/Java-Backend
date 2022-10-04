package JavaSyntaxis.basics;

public class RecursionMethodsExample {
    public static void main(String[] args) {
        countUntil(3);
        System.out.println(factorialCount(5));
    }

    private static int factorialCount(int i) {
        if (i == 1) return 1;
        return i * factorialCount(i - 1);
    }

    /*
    countUntil(3); ждет след метод
    countUntil(2); ждет след метод
    countUntil(1); ждет след метод
    countUntil(0); ждет след метод
    countUntil(-1); вышел из метода, так как -1 < 0

    countUntil(0); дождался метода и выводит строку
    countUntil(1); дождался выводит строку
    countUntil(2); должался выводит строку
    countUntil(3); дождался выводит строку, конец метода и рекурсии
     */
    private static void countUntil(int i) {
        if (i < 0) return;
        countUntil(i - 1);
        System.out.println(i + "");
    }
}
