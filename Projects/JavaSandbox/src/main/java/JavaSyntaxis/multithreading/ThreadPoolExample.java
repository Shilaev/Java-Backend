package JavaSyntaxis.multithreading;

import java.sql.Time;
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
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        for (int i = 0; i < 5; i++)
             executorService.submit(new Task(i));
        
        executorService.shutdown();
        
        boolean inTime = executorService.awaitTermination(10L, TimeUnit.SECONDS);
        
        if (inTime)
            System.out.println("done!");
        else if (!inTime)
            System.out.println("slow!!!!");
    }
}
