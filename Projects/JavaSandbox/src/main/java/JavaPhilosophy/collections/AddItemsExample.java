package JavaPhilosophy.collections;

import JavaSyntaxis.basics.Array;

import java.util.*;

public class AddItemsExample {
    public static void main(String[] args) {
        List<Integer> myLinkedList = new LinkedList<>(Arrays.<Integer>asList(2, 5, 1, 3, 4));
        List<Integer> myArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Integer[] moreInts = {6, 7, 8, 9, 10};
        myLinkedList.addAll(Arrays.asList(moreInts));
        Collections.addAll(myLinkedList, 11, 12, 13, 14, 15, 16);
        Collections.addAll(myLinkedList, moreInts);


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.set(1, 99);
//        list.add(21); // Ошибка - нельзя изменить размер базового массива.


        System.out.println(Arrays.toString(moreInts));
        System.out.println(myLinkedList);
        System.out.println(myArrayList);
        System.out.println(list);

    }
}
