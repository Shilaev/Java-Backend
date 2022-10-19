/*
Сумма чисел, не кратных 3
Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
 */

import java.util.Scanner;

public class SolutionJavaRush {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userWord = scanner.nextLine();
        int userCounterGoal = scanner.nextInt();

        int counter = 0;
        do {
            if (userCounterGoal <= 0 || userCounterGoal >= 5) userCounterGoal = 1;
            System.out.println(userWord);
            counter++;
        } while (counter < userCounterGoal);
    }
}
