package JavaSyntaxis.multithreading;

class MyNumber {
    private int counter;
    
    // неявное указаниее объекта синхронизации
//    public synchronized void incrementCounter(){
//        counter++;
//    }
    
    // идентичная запись, но явное указание объекта синхронизации
    public void incrementCounter(){
        synchronized (this){
            counter++;
        }
    }
    
    public void increment() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) incrementCounter();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) incrementCounter();
            }
        });
        
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        
        System.out.println(counter);
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        MyNumber myNumber = new MyNumber();
        myNumber.increment();
    }
    
}
