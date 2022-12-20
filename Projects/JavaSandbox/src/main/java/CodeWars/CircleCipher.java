package CodeWars;

public class CircleCipher {
    public static void main(String[] args) {
        System.out.println(encode("qwert"));
        System.out.println(decode(encode("qwert")));
    }

    public static String encode(String s) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0, j = s.length(); j > i; i++) {
            resultString.append(s.charAt(i));
            if (--j > i) resultString.append(s.charAt(j));
        }
        return resultString.toString();
    }

    public static String decode(String s) {
        StringBuilder resultStringL = new StringBuilder();
        StringBuilder resultStringR = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            (i % 2 == 0 ? resultStringL : resultStringR).append(s.charAt(i));
        return resultStringL.append(resultStringR.reverse()).toString();
    }
}
