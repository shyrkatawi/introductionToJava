package unit2.arrays.task3;

import unit2.MethodsUnit2;

/**
 * 3. Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
class Task3 {
    public static void main(String[] args) {
        double[] sourceArray = {1, 2, 3, 4, 0, 0, -1, -2, -3};
        MethodsUnit2.printArray(sourceArray);
        int[] resultArray = countNegativeZeroPositiveNumbers(sourceArray);
        System.out.println("number of negative elements: " + resultArray[0]);
        System.out.println("number of zero elements: " + resultArray[1]);
        System.out.println("number of positive elements: " + resultArray[2]);
    }

    /**
     * returns array with:
     * array[0] = negative elements;
     * array[1] = zero elements;
     * array[2] = positive elements;
     */
    static int[] countNegativeZeroPositiveNumbers(double[] array) {
        int negative = 0;
        int zero = 0;
        int positive = 0;
        for (double d : array) {
            if (d < 0) {
                negative++;
            } else if (d == 0) {
                zero++;
            } else {
                positive++;
            }
        }
        return new int[]{negative, zero, positive};
    }
}
