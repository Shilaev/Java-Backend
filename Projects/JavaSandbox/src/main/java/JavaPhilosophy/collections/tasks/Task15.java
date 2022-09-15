package JavaPhilosophy.collections.tasks;
/****************** Exercise 15 *****************
 * Stacks are often used to evaluate expressions
 * in programming languages.
 * evaluate the following
 * expression, where '+' means "push the following
 * letter onto the stack," and '-' means "pop the
 * top of the stack and print it":
 * "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---"
 ***********************************************/
import java.util.LinkedList;


public class Task15 {

    public static void main(String[] args) {
        String fullCommand = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        LinkedList<Character> result = new LinkedList<>();

        char[] data = fullCommand.toCharArray();
        for (int i = 0; i < data.length; )
            switch (data[i++]) {
                case '+':
                    result.push(data[i++]);
                    break;
                case '-':
                    System.out.print(result.pop());
                    break;
            }
    }
}
