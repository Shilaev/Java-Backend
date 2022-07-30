package JavaSyntaxis.multithreading;

import java.util.Scanner;

class WaitAndNotify {
    public void produce() {
        synchronized (this) {
            System.out.println("Producer thread started...");
            try {
                this.wait();
            } catch (InterruptedException e) { throw new RuntimeException(e); }
            System.out.println("producer thread resumed...");
        }
    }
    
    public void consume() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) { throw new RuntimeException(e); }
        Scanner scanner = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            this.notify();
        }
        
    }
}

public class WaitNotify {
    public static void main(String[] args) {
        WaitAndNotify waitAndNotify = new WaitAndNotify();
        
        Thread thread1 = new Thread(waitAndNotify::produce);
        Thread thread2 = new Thread(waitAndNotify::consume);
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) { throw new RuntimeException(e); }
    }
}
