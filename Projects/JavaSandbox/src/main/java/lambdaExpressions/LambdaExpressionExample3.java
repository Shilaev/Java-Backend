package lambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionExample3 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myLinkedList = new LinkedList<>();

        fillArray(myArray);
        fillArr(myArrayList);
        fillList(myLinkedList);

        System.out.println(Arrays.toString(myArray));
        System.out.println(myArrayList);
        System.out.println(myLinkedList);

        myArray = Arrays.stream(myArray).map(a -> a * 2).toArray();
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] *= 2;
//        }

        myArrayList = myArrayList.stream().map(a -> a * 2).collect(Collectors.toList());
//        for (int i = 0; i < myArrayList.size(); i++) {
//            myArrayList.set(i, myArrayList.get(i) * 2);
//        }

        myLinkedList = myLinkedList.stream().map(a -> a * 2).collect(Collectors.toList());
//        for (int i = 0; i < myLinkedList.size(); i++) {
//            myLinkedList.set(i, myLinkedList.get(i) * 2);
//        }

        myArrayList = myArrayList.stream().filter(a -> a % 3 == 0).collect(Collectors.toList());

        myArrayList.stream().forEach(System.out::println);

        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArray(arr3);
        fillList(list3);

        int sum = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt();
        System.out.println("SUM" + sum);

        System.out.println();
        System.out.println(Arrays.toString(myArray));
        System.out.println(myArrayList);
        System.out.println(myLinkedList);

    }

    private static void fillArr(List<Integer> array) {
        for (int i = 0; i < 10; i++) {
            array.add(i + 1);
        }
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
}
