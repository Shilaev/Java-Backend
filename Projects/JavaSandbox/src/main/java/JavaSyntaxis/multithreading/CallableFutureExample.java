package JavaSyntaxis.multithreading;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                
                int randomNumber = random.nextInt(100);
                if (randomNumber < 40) {
                    throw new Exception("less then 40");
                }
                
                return randomNumber;
            }
        });
        executorService.shutdown();
        
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}
