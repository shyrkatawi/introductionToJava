package unit2.sorting.task3;

import unit2.MethodsUnit2;

/**
 * 3. Сортировка выбором.
 * Дана последовательность чисел (неубывающая).
 * Требуется переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент
 * и ставится на первое место, а первый - на место наибольшего.
 * Затем, начиная со второго, эта процедура повторяется.
 * Написать алгоритм сортировки выбором.
 */
class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 78, 11, 1, 2, 6, 7, 99};
        MethodsUnit2.printArray(array, "before: ");
        sortingByChoiceInDescendingOrder(array);
        MethodsUnit2.printArray(array, "after: ");
    }

    static void sortingByChoiceInDescendingOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxPosition = i;
            for (int k = i; k < array.length; k++) {
                if (array[k] > max) {
                    max = array[k];
                    maxPosition = k;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[maxPosition] = temp;
        }
    }
}
