package JavaSyntaxis.multithreading;

class MyRunnableThread implements Runnable {
    
    private String message = "";
    private int counter = 0;
    
    public MyRunnableThread(String message, int counter) {
        this.message = message;
        this.counter = counter;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < counter; i++) {
            System.out.println(message);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableThread(
                "Your hands Around My Throat",
                100));
        
        Thread thread2 = new Thread(new MyRunnableThread(
                "There is No-One Here\n" +
                "There is No-One There",
                100));
        
        thread1.start();
        Thread.sleep(1000);
        thread2.start();
    }
}
