package unit2.arrays;

/**
 * 3. Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        task3(new double[]{1, 2, 3, 4, 0, 0, -1, -2, -3});
    }

    static void task3(double[] array) {
        int[] resultArray = countNegativeZeroPositiveNumbers(array);
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
