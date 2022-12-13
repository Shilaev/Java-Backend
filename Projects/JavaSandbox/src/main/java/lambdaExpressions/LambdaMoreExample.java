package lambdaExpressions;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class LambdaMoreExample {
    public static void main(String[] args) {

        Supplier<Double> supplier = () -> new Random().nextDouble();
        Double doubleOptional = Optional.of(4.5).orElseGet(supplier);

        System.out.println(doubleOptional);

    }
}
