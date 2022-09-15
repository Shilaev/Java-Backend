package JavaSyntaxis.collections;

import java.util.*;

public class CustomSortExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("frog");
        animals.add("dog");
        animals.add("cat");
        animals.add("bird");

//        Collections.sort(animals);
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);


        List<Integer> numbers = new LinkedList<>();
        numbers.add(0);
        numbers.add(-20);
        numbers.add(52);
        numbers.add(100);

//        Collections.sort(numbers);
//        Collections.reverse(numbers);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}