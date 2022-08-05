package JavaPhilosophy.multithreading.tasks;

/*
    Реализуйте интерфейс Runnable. В методе run() выведите сообщение, после чего
    вызовите yield(). Повторите три раза и верните управление из run(). Выведите на-
    чальное сообщение в конструкторе, а при завершении выведите конечное сообщение.
    Создайте несколько задач и организуйте их выполнение с использованием потоков.
 */
public class RunnableTaskOne {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Something in the way");
            }
                Thread.yield();
        });
        
        thread1.start();
        thread1.join();
        
        System.out.println("yeeeeeeeeaaaaahhhhhh");
    
    }
}
