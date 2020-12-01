package unit2.arrays.task2;

import unit2.MethodsUnit2;

/**
 * 2. Дана последовательность действительных чисел а1, а2, ..., аn.
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */
class Task2 {
    public static void main(String[] args) {
        double[] array = {1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1, 8.1, 9.1, 10.1};
        MethodsUnit2.printArray(array, "source array");
        int numberOfReplacement = task2(array, 6);
        MethodsUnit2.printArray(array, "result array");
        System.out.println("Number of replacement: " + numberOfReplacement);
    }

    static int task2(double[] array, double z) {
        int replaceCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                replaceCounter++;
            }
        }
        return replaceCounter;
    }
}