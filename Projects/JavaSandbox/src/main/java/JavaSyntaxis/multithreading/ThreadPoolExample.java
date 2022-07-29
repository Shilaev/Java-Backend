package JavaSyntaxis.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    private int id;
    
    public Task(int id) {
        this.id = id;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) { throw new RuntimeException(e); }
        
        System.out.println("Task id" + id + " was completed");
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        
        for (int i = 0; i < 5; i++)
             executorService.submit(new Task(i));
        
        executorService.shutdown();
        System.out.println("all tasks submitted");
        
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) { throw new RuntimeException(e); }
    }
}
