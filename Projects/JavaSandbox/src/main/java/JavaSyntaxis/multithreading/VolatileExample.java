package JavaSyntaxis.multithreading;

import java.util.Scanner;

class MyRunningThread extends Thread {
    
    private volatile boolean isRunning = true;
    
    @Override
    public void run() {
        while (isRunning) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }
    
    public void shutDown() {
        this.isRunning = false;
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        MyRunningThread myRunningThread = new MyRunningThread();
        myRunningThread.start();
    
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        myRunningThread.shutDown();
    }
}
