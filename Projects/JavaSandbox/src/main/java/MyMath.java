public class MyMath {
    public static double divide(int number1, int number2) {
        if (number1 == 0 || number2 == 0){
            throw new ArithmeticException("Can't divide by zero");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return number1 / number2;

    }
}
