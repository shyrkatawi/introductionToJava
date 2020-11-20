package unit1.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 7.Для каждого натурального числа в промежутке от m до n
 * вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */


//peredelay
public class Task7 {
    public static void main(String[] args) {
        task7();
//        System.out.printf("Ниже представлены делители чисел в промежутке от %d до %d, делитель в виде числа 1 и самого числа не учитываются\n", m, n);
//        method(m, n);
    }

    static void task7() {

    }

    private static void method(int[] array) {
        boolean isDivision = false;
        int m = array[0];
        int n = array[1];
        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    isDivision = true;
                    System.out.print(k + ", ");
                }
            }
            if (!isDivision) {
                System.out.print("отсутствуют, ");
            }
            isDivision = false;
            System.out.println();
        }
    }

    /**
     * Returns an array with array[0] = m and  array[1] = n.
     * If the user enters incorrect data method returns array with length = 0.
     */
    static int[] getIntegersFromUser() {
        int[] array = new int[0];
        int m = getIntegerFromUser(0);
        if (m != -1) {
            int n = getIntegerFromUser(m);
            if (n != -1) {
                array = new int[]{m, n};
            }
        }
        return array;
    }

    /**
     * If the user enters incorrect data method returns -1.
     */
    static int getIntegerFromUser(int limit) {
        int n = -1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Enter an integer n, n > %d\n", limit);
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= limit) {
                    throw new InputMismatchException("Invalid data entry. The number must be n > 0");
                }
            } else {
                throw new InputMismatchException("You have entered not a integer.");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR: " + e.getMessage());
//            e.printStackTrace(System.out);
        }
        return n;
    }
}