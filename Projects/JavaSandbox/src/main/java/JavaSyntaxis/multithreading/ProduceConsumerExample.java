package JavaSyntaxis.multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProduceConsumerExample {
    
    private static final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(20);
    private static boolean isRunning = true;
    
    private static void produce() {
        Random random = new Random(151);
        
        while (isRunning) {
            try {
                queue.put(random.nextInt(151));
            } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }
    
    private static void consume() {
        while (isRunning) {
            try {
//                Thread.sleep(1000);
                
                int element = queue.take();
                
                if (element == 150) isRunning = false;
                
                if (element % 2 == 0) {
                    System.out.println(element);
                    System.out.println("queue size:" + queue.size());
                }
            } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }
    
    public static void main(String[] args) {
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                produce();
            }
        });
        
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                consume();
            }
        });
        
        producerThread.start();
        consumerThread.start();
        
        try {
            consumerThread.join();
            producerThread.join();
        } catch (InterruptedException e) { throw new RuntimeException(e); }
    }
}
