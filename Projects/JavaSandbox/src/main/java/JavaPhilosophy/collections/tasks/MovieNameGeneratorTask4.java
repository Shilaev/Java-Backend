package JavaPhilosophy.collections.tasks;

import java.util.*;
import java.util.concurrent.Semaphore;

class MovieNameGenerator {
    String[] actors = new String[]{
            "Kolin Fert",
            "Julian Mur",
            "Nikolas Holt",
            "Matiue Good",
            "Joshn Kortaherena"
    };
    int cursor = 0;

    public String next() {
        cursor = (cursor + 1) % actors.length;
        return actors[cursor];
    }
}

public class MovieNameGeneratorTask4 {
    public static void main(String[] args) {
        // Create
        MovieNameGenerator generator = new MovieNameGenerator();

        List<String> myArrayList = new ArrayList<>(10);
        List<String> myLinkedList = new LinkedList<>();

        Set<String> myHashSet = new HashSet<String>(10);
        Set<String> myLinkedHashSet = new LinkedHashSet<>(10);
        Set<String> myTreeSet = new TreeSet<>();

        String[] actors = new String[25];
        for (int i = 0; i < actors.length; i++) actors[i] = generator.next();

        // Insert
        myArrayList.addAll(Arrays.asList(actors));
        myLinkedList.addAll(Arrays.asList(actors));

        myHashSet.addAll(Arrays.asList(actors));
        myLinkedHashSet.addAll(Arrays.asList(actors));
        myTreeSet.addAll(Arrays.asList(actors));


        // Print
        System.out.println(myArrayList);
        System.out.println(myLinkedList);

        System.out.println(myHashSet);
        System.out.println(myLinkedHashSet);
        System.out.println(myTreeSet);
    }
}
