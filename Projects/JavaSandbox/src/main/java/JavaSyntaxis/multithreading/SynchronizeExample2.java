package JavaSyntaxis.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Worker {
    Random random = new Random();
    
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    
    public synchronized void incrementList(int listNumber) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) { throw new RuntimeException(e); }
        
        switch (listNumber) {
            case (1):
                list1.add(random.nextInt(0, 101));
                break;
            case (2):
                list2.add(random.nextInt(0, 101));
                break;
        }
    }
    
    public void work() {
        long before = System.currentTimeMillis();
        
        Thread incrementList1Thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    incrementList(1);
                }
            }
        });
        
        Thread incrementList2Thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    incrementList(2);
                }
            }
        });
        
        incrementList1Thread.start();
        incrementList2Thread.start();
        
        try {
            incrementList1Thread.join();
            incrementList2Thread.join();
        } catch (InterruptedException e) { throw new RuntimeException(e); }
        
        long after = System.currentTimeMillis();
        
        System.out.println("runtime:" + (after - before));
        System.out.print("list1 size: " + list1.size() + '\n');
        System.out.print("list2 size: " + list2.size() + '\n');
    }
    
    public void main() {
        work();
    }
}

public class SynchronizeExample2 {
    public static void main(String[] args) {
        new Worker().main();
    }
}
