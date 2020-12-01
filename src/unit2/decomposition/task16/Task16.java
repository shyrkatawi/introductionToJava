package unit2.decomposition.task16;

/**
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме.
 * Для решения задачи использовать декомпозицию.
 */
class Task16 {
    public static void main(String[] args) {
        int sum = sumOfNumbersContainingOnlyOddDigits(11, 123, 4444, 333, -11, 359);
        System.out.printf("Sum of numbers containing only odd digits: %d\n", sum);
        int amountOfEvenDigitsInSum = getAmountOfEvenDigits(sum);
        System.out.printf("The number of even digits in the sum: %d\n", amountOfEvenDigitsInSum);
    }

    static int sumOfNumbersContainingOnlyOddDigits(int... array) {
        int sum = 0;
        for (int i : array) {
            if (isContainsOnlyOddDigits(i)) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean isEven(int i) {
        return i % 2 == 0;
    }

    static int getAmountOfEvenDigits(int i) {
        if (i == 0) {
            return 1;
        }
        int amount = 0;
        while (i > 0) {
            int digit = i % 10;
            if (isEven(digit)) {
                amount++;
            }
            i /= 10;
        }
        return amount;
    }

    static boolean isContainsOnlyOddDigits(int i) {
        while (i > 0) {
            int digit = i % 10;
            if (isEven(digit)) {
                return false;
            }
            i /= 10;
        }
        return true;
    }
}
