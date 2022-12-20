package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class whoLikesItSolution {

    public static void main(String[] args) {
        whoLikesIt("name1");
    }

    public static String whoLikesIt(String... names) {
        List<String> allNames = new ArrayList<>(List.of(names));
        int length = allNames.size();

        if (length == 0) {
            return "no one likes this";
        }
        if (length == 1) {
            return names[1] + " likes this";
        }
        if (length == 2) {
            return names[1] + " and " + names[2] + " like this";
        }
        if (length == 3) {
            return names[1] + "," + names[2] + " and " + names[3] + " like this";
        }
        if (length >= 4) {
            int otherNamesCount = length - 4;
            return names[1] + "," + names[2] + " and " + otherNamesCount + " others" + " like this";
        }

        return "error";

    }
}
