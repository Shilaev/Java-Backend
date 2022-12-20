package Ariphmmetica;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(checkString(""));
    }

    public static boolean checkString(String s) {
        String[] splited = s.split("");
        boolean isCorrect = false;

        Map<String, String> bracketsConformity = new HashMap<>();
        bracketsConformity.put("(", ")");
        bracketsConformity.put("[", "]");
        bracketsConformity.put("{", "}");

        return isCorrect;
    }
}
