package JavaSyntaxis.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Connection {
    private static final Connection connection = new Connection();
    private int connectionCount;
    private final Lock monitor = new ReentrantLock();
    private final Semaphore semaphore = new Semaphore(10);
    
    private Connection() { }
    
    public static Connection getConnection() {
        return connection;
    }
    
    private void increaseConnectionCount() {
        monitor.lock();
        
        connectionCount++;
        System.out.println(connectionCount);
        
        monitor.unlock();
    }
    
    private void decreaseConnectionCount() {
        monitor.lock();
        
        connectionCount--;
        System.out.println(connectionCount);
        
        monitor.unlock();
    }
    
    private void work() throws InterruptedException {
        increaseConnectionCount();
        Thread.sleep(5000);
        decreaseConnectionCount();
    }
    
    public void doWork() throws InterruptedException {
        semaphore.acquire();
        try {
            work();
        } finally {
            semaphore.release();
        }
    }
}

public class SemaphoreExample {
    public static void main(String[] args) throws InterruptedException {
        int threadsNumber = 20;
        ExecutorService executorService = Executors.newFixedThreadPool(threadsNumber);
        
        Connection connection = Connection.getConnection();
        
        for (int i = 0; i < threadsNumber; i++) {
            executorService.submit(() -> {
                try {
                    connection.doWork();
                } catch (InterruptedException e) { throw new RuntimeException(e); }
            });
        }
        
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
