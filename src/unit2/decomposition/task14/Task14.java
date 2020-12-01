package unit2.decomposition.task14;

import java.util.ArrayList;
import java.util.List;

/**
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр возведенная в степень n, равна самому числу.
 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */
class Task14 {
    public static void main(String[] args) {
        List<Integer> result = task14(410);
        System.out.println(result);
    }

    static List<Integer> task14(int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < k; i++) {
            int sum = 0;
            int tmp = i;
            int amountOfDigits = getAmountOfDigits(i);
            while (tmp > 0) {
                int digit = tmp % 10;
                sum += Math.pow(digit, amountOfDigits);
                tmp /= 10;
            }
            if (i == sum) {
                list.add(i);
            }
        }
        return list;
    }

    static int getAmountOfDigits(int n) {
        int amount = 0;
        if (n < 10) {
            amount++;
        } else {
            while (n != 0) {
                amount++;
                n /= 10;
            }
        }
        return amount;
    }

//    static void task14(int k) {
//        for (int i = 1; i < k; i++) {
//            int sum = 0;
//            int tmp = i;
//            int amountOfDigits = getAmountOfDigits(i);
//            while (tmp > 0) {
//                int digit = tmp % 10;
//                sum += Math.pow(digit, amountOfDigits);
//                tmp /= 10;
//            }
//            System.out.printf("\nИсходное число: %d, сумма его каждой возведенной в степень %d цифры: %d\n", i, i, sum);
//            if (i == sum) {
//                System.out.printf("Число %d является числом Армстронга.\n", i);
//            } else {
//                System.out.printf("Число %d не является числом Армстронга.\n", i);
//            }
//        }
//    }
}
