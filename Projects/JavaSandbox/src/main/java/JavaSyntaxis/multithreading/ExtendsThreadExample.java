package JavaSyntaxis.multithreading;

class MyThread extends Thread {
    
    private String message = "";
    private int counter = 0;
    
    public MyThread(String message, int counter) {
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

public class ExtendsThreadExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread(
                "Your hands Around My Throat",
                100);
        
        MyThread myThread2 = new MyThread(
                "There is No-One Here\n" +
                "There is No-One There",
                100);
        
        myThread1.start();
        Thread.sleep(1000);
        myThread2.start();
        
        System.out.println();
    }
}
