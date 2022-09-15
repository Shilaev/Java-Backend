package JavaPhilosophy.collections;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> myRefList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myRefList.add(i);
        }
        LinkedList<Integer> myList = new LinkedList<>(myRefList);

        ListIterator<Integer> myListIterator = myList.listIterator(myList.size() >> 1);

        Random rand = new Random(15);
        for (int i = 0; i < 20; i++) {
            myListIterator.add(rand.nextInt(40, 50));
            myListIterator.previous();
        }

        System.out.println(myList);

    }
}
