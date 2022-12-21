package CodeWars;

import java.util.Arrays;

public class FindTheParityOutlier {
    public static void main(String[] args) {
        int[] exampleTest1 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        System.out.println(find(exampleTest1));
    }

    static int find(int[] integers) {
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = sum == 1 || sum == 0 ? 1 : 0;

        return Arrays.stream(integers).parallel()
                .filter(x -> Math.abs(x) % 2 == mod).findFirst().getAsInt();
    }

}
