package unit2.decomposition.task15;

import java.util.ArrayList;
import java.util.List;

/**
 * 15. Найти все натуральные n-значные числа,
 * цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
 * Для решения задачи использовать декомпозицию.
 */
class Task15 {
    public static void main(String[] args) {
        List<Integer> result = task15(11, 123, 321, 313, 359, 120);
        System.out.println(result);
    }

    static List<Integer> task15(int... array) {
        List<Integer> result = new ArrayList<>();
        for (int i : array) {
            if (isIncreasingSequence(i)) {
                result.add(i);
            }
        }
        return result;
    }

    static boolean isIncreasingSequence(int i) {
        int max = 10;
        while (i > 0) {
            int digit = i % 10;
            if (max <= digit) {
                return false;
            }
            max = digit;
            i /= 10;
        }
        return true;
    }
}
