package CodeWars;

/*
�������� ���, �������
������� ����� �� 0 �� 1000,
������� ������� �� 3,
�� �� ������� �� 5,
� ����� ���� � ������� ������ ������. ()
 */

import java.util.LinkedList;
import java.util.List;

public class ThousandNumbersWithCondition {

    public static void getThousandNumbers() {
        for (int i = 0; i <= 1000; i++)
            if ((i % 3 == 0) && (i % 5 != 0))
                System.out.println(i);

    }

    public static void main(String[] args) {
        getThousandNumbers();
    }


    // count chars in number
    // recursive method
    static int count(int n) {
        if (n / 10 != 0) {
            return 1 + count(n / 10);
        }
        return 1;
    }

    // count chars in number
    // string method
    static int countStringMethod(int n) {
        return Integer.toString(n).toString().split("").length;
    }

}
