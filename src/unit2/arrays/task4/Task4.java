package unit2.arrays.task4;

import unit2.MethodsUnit2;

/**
 * 4. Даны действительные числа а1, а2, ..., аn .
 * Поменять местами наибольший и наименьший элементы.
 */
class Task4 {
    public static void main(String[] args) {
        double[] sourceArray = new double[]{1, 2, 3, 4, -2, -3};
        MethodsUnit2.printArray(sourceArray, "source array");
        double[] changedArray = getArrayWithSwappedMinMaxElements(sourceArray);
        MethodsUnit2.printArray(changedArray, "result array");
    }

    static double[] getArrayWithSwappedMinMaxElements(double[] sourceArray) {
        double[] array = MethodsUnit2.copyArray(sourceArray);
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
        return array;
    }
}
