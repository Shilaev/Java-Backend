package CodeWars;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(checkString(""));
    }

    public static boolean checkString(String parens) {
        char[] lineForCheck = parens.toCharArray();
        List<Character> brackets = new ArrayList<>(List.of('(', ')', '{', '}', '[', ']'));
        Stack<Character> charList = new Stack<>();

        for (char currentChar : lineForCheck) {
            if (!brackets.contains(currentChar)) continue;
            
            if (currentChar == '(') charList.add('(');
            else if (currentChar == '{') charList.add('{');
            else if (currentChar == '[') charList.add('[');
            else if (currentChar == ')' && !charList.isEmpty() && charList.contains('(') && charList.peek() == '(')
                charList.pop();
            else if (currentChar == '}' && !charList.isEmpty() && charList.contains('{') && charList.peek() == '{')
                charList.pop();
            else if (currentChar == ']' && !charList.isEmpty() && charList.contains('[') && charList.peek() == '[')
                charList.pop();
            else return false;
        }
        return charList.isEmpty();
    }
}
