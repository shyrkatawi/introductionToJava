package unit1.cycles;

import java.util.Scanner;

/**
 * 7.Для каждого натурального числа в промежутке от m до n
 * вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
public class Task7 {
    public static void main(String[] args) {
        task7();
    }

    static void task7() {
        int[] array = getIntsFromScanner();
        boolean isDivision = false;
        int m = array[0];
        int n = array[1];
        for (int i = m; i <= n; i++) {
            System.out.print("Divisors of a number " + i + ": ");
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    isDivision = true;
                    System.out.print(k + " ");
                }
            }
            if (!isDivision) {
                System.out.print("do not exist");
            }
            isDivision = false;
            System.out.println();
        }
    }


    /**
     * Returns an array with array[0] = m and  array[1] = n.
     */
    static int[] getIntsFromScanner() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer m");
            int m = sc.nextInt();
            System.out.println("Enter an integer n");
            int n = sc.nextInt();
            return new int[]{m, n};
        }
    }
}