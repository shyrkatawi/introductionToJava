package unit1.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. Напишите программу, где пользователь вводит любое целое положительное число,
 * а программа суммирует все числа от 1 до введенного пользователем числа.
 */
class Task1 {
    public static void main(String[] args) {
        int n = getIntegerFromUser();
        if (n != -1) {
            int result = calculateSumFromOneToNumber(n);
            System.out.println("The total sum is " + result);
        }
    }

    /**
     * The parameter n is assumed to be greater than 1.
     * Otherwise method returns -1.
     */
    static int calculateSumFromOneToNumber(int n) {
        int sum = 0;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else {
            sum = -1;
        }
        return sum;
    }

    /**
     * If the user enters incorrect data method returns -1.
     */
    static int getIntegerFromUser() {
        int n = -1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an integer n, n > 0");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
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
