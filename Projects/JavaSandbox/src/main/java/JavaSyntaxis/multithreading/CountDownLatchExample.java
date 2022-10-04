package JavaSyntaxis.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {
    private CountDownLatch countDownLatch;
    
    public Processor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) { throw new RuntimeException(e); }
        
        countDownLatch.countDown();
        System.out.println(this + "done");
    }
}

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        for (int i = 0; i < 3; i++)
             executorService.submit(new Processor(countDownLatch));
        executorService.shutdown();
        
        for (int i = 0; i < 3; i++) {
            Thread.sleep(3000);
            countDownLatch.countDown();
        }
        System.out.println("Main thread is done!");
        
        countDownLatch.await();
        System.out.println("Latch has been opened, main thread is proceeding");
    }
}
