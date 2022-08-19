package Algorithms;

import java.util.LinkedList;

public class RecursiveAlgorithms {
    public static void countDownListPusher(int x, LinkedList<Integer> countDownList) {
        if (x < 1) return;
        countDownList.push(x);
        countDownListPusher(x - 1, countDownList);
    }

    public static int factorial(int x) {
        if (x == 1) return 1;
        return factorial(x - 1) * x;
    }   

    public static void main(String[] args) {
        // COUNTDOWN
        LinkedList<Integer> countDownList = new LinkedList<>();
        countDownListPusher(10, countDownList);

        int size = countDownList.size();
        for (int i = 0; i < size; i++) System.out.print(countDownList.pop());
        // COUNTDOWN

        System.out.println();

        //FACTORIAL
        System.out.println(factorial(5));
        //FACTORIAL
    }
}
