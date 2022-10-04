package JavaPhilosophy.collections;

import java.util.*;

public class CollectionCreateExample {
    public static void main(String[] args) {
        Collection<Integer> myCollection = new LinkedHashSet<>();
        Collection<Integer> myCollection2 = new HashSet<>();
        Collection<Integer> myCollection3 = new TreeSet<>();

        System.out.println(myCollection.add(1));
        System.out.println(myCollection.add(1));
        System.out.println(myCollection);

        System.out.println(myCollection2.add(2));
        System.out.println(myCollection2);

        System.out.println(myCollection3.add(3));
        System.out.println(myCollection3);
    }
}
