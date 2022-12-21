package lambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Training {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));

        System.out.println(nums.stream()
                .reduce(Integer::sum)
                .orElse(-1));


        int[] intStream = nums.stream().parallel()
                .filter(x -> x / 3 == 3)
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();

        Arrays.stream(intStream)
                .mapToObj(elem -> elem + " ")
                .forEach(System.out::print);
    }
}
