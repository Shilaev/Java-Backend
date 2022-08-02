package JavaSyntaxis.multithreading;

import java.util.Random;

public class ThreadInterruptingExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            Random randomNumber = new Random();
            for (int j = 0; j < 1_000_000_000; j++) {
                System.out.println(Math.sin(randomNumber.nextDouble()));
                if (Thread.currentThread().isInterrupted()) break;
            }
        });
        
        System.out.println("Starting thread");
        thread.start();
        
        Thread.sleep(1000);
        thread.interrupt();
        
        thread.join();
        System.out.println("Thread has finished");
    }
}
