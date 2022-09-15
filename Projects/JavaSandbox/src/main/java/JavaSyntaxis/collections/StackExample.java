package JavaSyntaxis.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        for (int i = 0; i < 10; i++) myStack.push(i);

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
