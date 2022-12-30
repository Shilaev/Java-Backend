package CodeWars;

import org.junit.jupiter.api.ClassOrderer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class SimpleNumbers {

    int mPower(int x, int e, int m) {
        int res = 1;

        while (e > 0) {
            if ((e % 2) == 1) {
                res = (res * x) % m;
                e--;
            } else {
                x = (x * x) % m;
                e = e / 2;
            }
        }
        return res;
    }

    boolean isPrime(int n) {
        int k = 100;
        if (n % 2 == 0 && n != 2) {
            return false;
        }

        if (n <= 3) {
            return true;
        }

        while (k > 0) {
            int a = (int) (Math.random() * (n - 3)) + 2;
            if (mPower(a, n - 1, n) != 1) {
                return false;
            }

            k--;
        }

        return true;
    }
}
