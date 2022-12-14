package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMoreExample {
    public static void main(String[] args) {

        Supplier<Double> supplier = () -> new Random().nextDouble();
        Double doubleOptional = Optional.of(4.5).orElseGet(supplier);

        System.out.println(doubleOptional);

        List<String> listOfJFirst = new ArrayList<>();


        Consumer<String> addOnlyJFirstToList = s -> {
            if (s.startsWith("J")) listOfJFirst.add(s);
        };

        addOnlyJFirstToList.accept("Java");
        addOnlyJFirstToList.accept("Jayson");
        addOnlyJFirstToList.accept("Hld");

        listOfJFirst.forEach(s -> System.out.println(s.length()));


        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Predicate<Integer> isEven = integer -> integer % 2 == 0;

        list.removeIf(isEven.negate());
        System.out.println(list);


        List<String> names = new ArrayList<>(List.of("one", "two", "three"));
        Function<String, Integer> getLength = String::hashCode;
        System.out.println(names.stream().map(getLength).collect(Collectors.toList()));

    }
}
