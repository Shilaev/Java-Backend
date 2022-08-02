package JavaSyntaxis.multithreading;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
    private int balance = 10_000;
    
    public void deposit(int amount) { balance += amount; }
    
    public void withdraw(int amount) { balance -= amount; }
    
    public int getBalance() { return balance; }
    
    public static void transfer(Account account1, Account account2, int amount) {
        account1.withdraw(amount);
        account2.deposit(amount);
    }
}

class DeadLockSolution {
    private final Account account1 = new Account();
    private final Account account2 = new Account();
    
    private final Lock monitor1 = new ReentrantLock();
    private final Lock monitor2 = new ReentrantLock();
    
    public void firstThread() {
        lock();
        try {
            transferMoney(account1, account2);
        } finally {
            unlock();
        }
    }
    
    public void secondThread() {
        lock();
        try {
            transferMoney(account2, account1);
        } finally {
            unlock();
        }
    }
    
    private void lock() {
        boolean isMonitor1Locked = false;
        boolean isMonitor2Locked = false;
        
        while (true) {
            try {
                isMonitor1Locked = monitor1.tryLock();
                isMonitor2Locked = monitor2.tryLock();
            } finally {
                if (isMonitor1Locked && isMonitor2Locked)
                    return;
                
                if (isMonitor1Locked) {
                    monitor1.unlock();
                }
                
                if (isMonitor2Locked) {
                    monitor2.unlock();
                }
            }
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }
    
    private void unlock() {
        monitor1.unlock();
        monitor2.unlock();
    }
    
    private void transferMoney(Account from, Account to) {
        Random randomAmount = new Random();
        for (int i = 0; i < 10_000; i++) {
            Account.transfer(from, to, randomAmount.nextInt(0, 100));
        }
    }
    
    public int finished() {
        int account1Balance = account1.getBalance();
        int account2Balance = account2.getBalance();
        int totalBalance = account1Balance + account2Balance;
        
        System.out.println("account1:      " + account1Balance);
        System.out.println("account2:      " + account2Balance);
        System.out.println("total balance: " + totalBalance);
        
        return totalBalance;
    }
}


public class DeadLockExample {
    public static void main(String[] args) throws InterruptedException {
        solution();
    }
    
    public static int solution() throws InterruptedException {
        DeadLockSolution deadLockSolution = new DeadLockSolution();
        
        int threadNumber = 10;
        ExecutorService firstThreads = Executors.newFixedThreadPool(threadNumber);
        for (int i = 0; i < threadNumber; i++)
             firstThreads.submit(deadLockSolution::firstThread);
        
        ExecutorService secondThreads = Executors.newFixedThreadPool(threadNumber);
        for (int i = 0; i < threadNumber; i++)
             secondThreads.submit(deadLockSolution::secondThread);
        
        firstThreads.shutdown();
        secondThreads.shutdown();
        
        while (!firstThreads.awaitTermination(3L, TimeUnit.SECONDS) &&
               !secondThreads.awaitTermination(3L, TimeUnit.SECONDS)) {
            System.out.println("Not yet. Still waiting for termination");
        }
        
        return deadLockSolution.finished();
    }
}
