package CodeWars;

public class VowelCounter {
    public static int count(String s) {
        int sum = 0;
        for (String elem : s.split("")) {
            if (elem.equals("a") ||
                    elem.equals("e") ||
                    elem.equals("i") ||
                    elem.equals("o") ||
                    elem.equals("u")
            )
                sum++;
        }
        return sum;
    }
}
