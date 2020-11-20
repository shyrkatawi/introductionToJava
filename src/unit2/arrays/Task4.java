package unit2.arrays;

/**
 * 4. Даны действительные числа а1, а2, ..., аn .
 * Поменять местами наибольший и наименьший элементы.
 */
public class Task4 {
    public static void main(String[] args) {
        double[] array = new double[]{1, 2, 3, 4, 0, 0, -1, -2, -3};
        Main.showArray(array, "source array");
        swapMinMaxElementsInArray(array);
        Main.showArray(array, "result array");
    }

    static void swapMinMaxElementsInArray(double[] array) {
        int minPosition = 0;
        double min = array[minPosition];
        int maxPosition = 0;
        double max = array[maxPosition];
        for (int i = 1; i < array.length; i++) {
            double element = array[i];
            if (min > element) {
                min = element;
                minPosition = i;
            } else if (max < element) {
                max = element;
                maxPosition = i;
            }
        }

        double tempForSwap = array[minPosition];
        array[minPosition] = array[maxPosition];
        array[maxPosition] = tempForSwap;
    }
}
