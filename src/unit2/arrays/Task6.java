package unit2.arrays;

import java.util.Random;

/**
 * 6. Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */
public class Task6 {
    public static void main(String[] args) {
        int n = 22;
        double[] array = createArrayWithRandomDoubles(n);
        Main.showArray(array, "source array");
        double sum = sumOfNumbersWhosePositionIsPrimeNumber(array);
        System.out.println(sum);
    }

    static double sumOfNumbersWhosePositionIsPrimeNumber(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(i + 1)) { //i+1 потому что в Java отсчёт элементов ведётся от 0, а в математике от 1
                sum = sum + array[i];
            }
        }
        return sum;
    }

    private static boolean isPrimeNumber(int index) {
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

    private static double[] createArrayWithRandomDoubles(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextDouble();
        }
        return array;
    }
}
