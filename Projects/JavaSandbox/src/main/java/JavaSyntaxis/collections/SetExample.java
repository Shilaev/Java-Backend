package JavaSyntaxis.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        addToSet(hashSet);
        addToSet(linkedHashSet);
        addToSet(treeSet);

        printSet(hashSet);
        printSet(linkedHashSet);
        printSet(treeSet);

        // Euler example
        hashSet.add("UniqueElement1");
        hashSet.add("UniqueElement2");
        hashSet.add("UniqueElement3");

        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("Something1");
        hashSet2.add("Something2");
        hashSet2.add("Something3");
        hashSet2.add("UniqueElement1");

        // union
        Set<String> union_hashSet_hashSet2 = new LinkedHashSet<>(hashSet);
        union_hashSet_hashSet2.addAll(hashSet2);
        System.out.println("Union:" + union_hashSet_hashSet2);

        // intersection
        Set<String> intersection_hashSet_hashSet2 = new LinkedHashSet<>(hashSet);
        intersection_hashSet_hashSet2.retainAll(hashSet2);
        System.out.println("Intersection:" + intersection_hashSet_hashSet2);

        // subtraction
        Set<String> subtraction_hashSet_hashSet2 = new LinkedHashSet<>(hashSet);
        subtraction_hashSet_hashSet2.removeAll(hashSet2);
        System.out.println("Subtraction:" + subtraction_hashSet_hashSet2);
    }

    private static void addToSet(Set<String> set) {
        set.add("Alan");
        set.add("Mike");
        set.add("Katy");
        set.add("Tom");
        set.add("Donny");
    }

    private static void printSet(Set<String> set) {
        for (String elem : set) System.out.println(elem);
        System.out.println();
    }
}
