package CodeWars;

import java.text.MessageFormat;

public class whoLikesIt {

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    public static String whoLikesIt(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> MessageFormat.format("{0} likes this", names[0]);
            case 2 -> MessageFormat.format("{0} and {1} like this", names[0], names[1]);
            case 3 -> MessageFormat.format("{0}, {1} and {2} like this", names[0], names[1], names[2]);
            default -> MessageFormat.format("{0}, {1} and {2} others like this", names[0], names[1], names.length - 2);
        };
    }
}
