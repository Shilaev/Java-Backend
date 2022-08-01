package JavaSyntaxis.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockSolution {
    private int counter = 0;
    private final Lock monitor = new ReentrantLock();
    
    public int getCounter() {
        return counter;
    }
    
    private void incrementCounter() {
        for (int i = 0; i < 10_000; i++) {
            counter++;
        }
    }
    
    public void firstThread() {
        monitor.lock();
        incrementCounter();
        monitor.unlock();
    }
    
    public void secondThread() {
        monitor.lock();
        incrementCounter();
        monitor.unlock();
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLockSolution reentrantLockSolution = new ReentrantLockSolution();
        
        Thread firstThread = new Thread(reentrantLockSolution::firstThread);
        Thread secondThread = new Thread(reentrantLockSolution::secondThread);
        
        firstThread.start();
        secondThread.start();
        
        firstThread.join();
        secondThread.join();
        
        System.out.println(reentrantLockSolution.getCounter());
    }
}
