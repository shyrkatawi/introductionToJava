package unit2.arrays.task6;

import unit2.MethodsUnit2;

import java.util.Random;

/**
 * 6. Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */
class Task6 {
    public static void main(String[] args) {
        int n = 22;
        double[] array = createArrayWithRandomDoubles(n);
        MethodsUnit2.printArray(array, "source array");
        double sum = sumOfNumbersWhosePositionIsPrimeNumber(array);
        System.out.println(sum);
    }

    static double sumOfNumbersWhosePositionIsPrimeNumber(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(i + 1)) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    static boolean isPrimeNumber(int index) {
        if (index < 2) {
            return false;
        }
        for (int i = 2; i <= index / 2; i++) {
            if (index % i == 0) {
                return false;
            }
        }
        return true;
    }

    static double[] createArrayWithRandomDoubles(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10) + 0.5;
        }
        return array;
    }
}
