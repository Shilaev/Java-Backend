package lambdaExpressions;

public class LambdaExpressionsExample1 {
    public static void main(String[] args) {
        Thread myThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("do some");
            }
        });

        Thread myThread2 = new Thread(() -> {
            System.out.println("do some");
        });
    }
}
