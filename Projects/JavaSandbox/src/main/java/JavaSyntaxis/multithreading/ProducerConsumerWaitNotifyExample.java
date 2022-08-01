package JavaSyntaxis.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Solution {
    
    private final Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10_000;
    private final Object lock = new Object();
    private final Random randomNumber = new Random();
    
    boolean isRunning = true;
    
    public void produce() throws InterruptedException {
        while (isRunning) {
            synchronized (lock) {
                while (queue.size() == LIMIT) lock.wait();
                /*
                Можно использовать if, но используя while мы обезопасили себя от ошибок
                После notify мы просыпаемся там, где был wait, и если был бы if, то мы продолжили выполнение,
                но так как там while, то мы еще раз зайдем в цикл while и еще раз проверим, точно ли все окей.
                 */
                
                queue.add(randomNumber.nextInt(1000));
                lock.notify();
                /*
                Так как notify не отдает монитор lock, его лучше ставить в конце, чтобы
                сразу после оповещения отдать монитор.
                 */
            }
        }
    }
    
    public void consume() throws InterruptedException {
        while (isRunning) {
            synchronized (lock) {
                while (queue.size() == 0) lock.wait();
                
                int element = queue.remove();
                if (element == 172) isRunning = false;
                if (element % 2 == 0) System.out.println(element);
                lock.notify();
            }
        }
    }
}

public class ProducerConsumerWaitNotifyExample {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        Thread produceThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    solution.produce();
                } catch (InterruptedException e) { throw new RuntimeException(e); }
            }
        });
        Thread consumeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    solution.consume();
                } catch (InterruptedException e) { throw new RuntimeException(e); }
                
            }
        });
        
        produceThread.start();
        consumeThread.start();
        
        try {
            produceThread.join();
            produceThread.join();
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
