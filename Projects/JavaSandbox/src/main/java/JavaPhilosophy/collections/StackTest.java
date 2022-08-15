package JavaPhilosophy.collections;

import java.util.LinkedList;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        int size = 10;

        System.out.println("myStack1: ");
        LinkedList<Integer> myStack1 = new LinkedList<>();
        for (int i = 0; i < size; i++) myStack1.offer(i);
        for (int i = 0; i < size; i++) System.out.print(myStack1.remove() + " "); // LIFO
//        for (int i = 0; i < size; i++) System.out.print(myStack1.removeLast() + " "); // FIFO

        System.out.println('\n');
        System.out.println("myStack2: ");
        Stack<Integer> myStack2 = new Stack<>();
        for (int i = 0; i < size; i++) myStack2.push(i);
        for (int i = 0; i < size; i++) System.out.print(myStack2.pop() + " ");
    }
}
