package JavaPhilosophy.multithreading.tasks;
/*
    Создайте задачу, которая генерирует последовательность из n
    чисел Фибоначи (значение n передается в конструкторе).
    Создайте несколько таких задач и выполните их в потоках.
 */

import java.util.ArrayList;
import java.util.List;

class FibonacciGenerator {
    private int count = 0;
    
    public FibonacciGenerator(int count) {
        this.count = count;
    }
    
    public List<Integer> generate() {
        List<Integer> fibonacciArray = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            fibonacciArray.add(fib(i));
        }
        return fibonacciArray;
    }
    
    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }
}

public class ThreadTaskTwo {
    public static void main(String[] args) {
        Thread generateFibonacci1 = new Thread(new Runnable() {
            FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(10);
            
            @Override
            public void run() {
                System.out.println(fibonacciGenerator.generate());
                Thread.yield();
            }
        });
    
        Thread generateFibonacci2 = new Thread(new Runnable() {
            FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(20);
        
            @Override
            public void run() {
                System.out.println(fibonacciGenerator.generate());
                Thread.yield();
            }
        });
        
        generateFibonacci1.start();
        generateFibonacci2.start();
    }
}
