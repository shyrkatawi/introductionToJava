package unit2.arrays.task7;

import unit2.MethodsUnit2;

/**
 * 7. Даны действительные числа a1, a2, ..., a(n), ..., a(2n).
 * Найти max(a1 + a(n), a2 + a(n-1), a3 + a(n-2) и т.д.)
 */
class Task7 {
    public static void main(String[] args) {
        double[] sourceArray = {1, 2, 2, 4, 5, 3, 7, 8, 3, 5};
        MethodsUnit2.printArray(sourceArray);
        double result = task7(sourceArray);
        System.out.println("result: " + result);
    }

    static double task7(double[] array) {
        double[] arrayOfSum = new double[array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            arrayOfSum[i] = array[i] + array[array.length - i - 1];
        }
        MethodsUnit2.printArray(arrayOfSum, "temp array of sum");
        double max = arrayOfSum[0];
        for (int i = 1; i < arrayOfSum.length; i++) {
            if (arrayOfSum[i] > max) {
                max = arrayOfSum[i];
            }
        }
        return max;
    }
}
