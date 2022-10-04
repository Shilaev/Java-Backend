package JavaPhilosophy.collections;

import java.util.*;

public class MyHashSetExample {
    public static void main(String[] args) {
        int initialCapacity = 15;

        Set<Integer> myHashSet = new HashSet<>(initialCapacity);
        Set<Integer> myLinkedHashSet = new LinkedHashSet<>(initialCapacity);
        Set<Integer> myTreeSet = new TreeSet<>();

        initSet(initialCapacity, myHashSet);
        initSet(initialCapacity, myLinkedHashSet);
        initSet(initialCapacity, myTreeSet);

        myHashSet.removeIf(a -> a < 10);

        System.out.println(myHashSet);
        System.out.println(myLinkedHashSet);
        System.out.println(myTreeSet);


        System.out.println("myHashSet.contains(0): " + myHashSet.contains(0));
        System.out.println("myHashSet.containsAll(myLinkedHashSet): " + myHashSet.containsAll(myLinkedHashSet));
    }

    /**
     * init set with this set of numbers
     * [0, 3, 8, 9, 21, 26, 28, 47, 52, 54, 62, 85]
     *
     * @param size
     * @param set
     */
    public static void initSet(int size, Set<Integer> set) {
        Random random = new Random(127);
        for (int i = 0; i < size; i++) set.add(random.nextInt(0, 100));
    }
}
