package Sandbox;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        String[] characters = s.split("");

        Map<String, String> brackets = new HashMap<>();
        brackets.put("(", ")");
        brackets.put("[", "]");
        brackets.put("{", "}");

        for (int i = 0; i < characters.length; i++) {
            String current = characters[i];
            String next = characters[i + 1];

            if (!brackets.get(current).equals(next)) {
                return false;
            }

            i++;
        }

        return true;
    }
}


