package JavaPhilosophy.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        int size = 20;
        List<Integer> myList1 = new ArrayList<>(20);
        List<Integer> myList2 = new ArrayList<>(20);

        for (int i = 0; i < size; i++) myList1.add(i);

        ListIterator<Integer> myList1Iterator = myList1.listIterator(myList1.size());

        while (myList1Iterator.hasPrevious()) {
            myList2.add(myList1Iterator.previousIndex());
            myList1Iterator.previous();
        }

        while (myList1Iterator.hasNext()){
            myList1Iterator.nextIndex();
            myList1Iterator.next();
        }
    }
}
