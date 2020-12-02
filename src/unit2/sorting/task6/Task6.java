package unit2.sorting.task6;

import unit2.MethodsUnit2;

/**
 * 6. Сортировка Шелла.
 * Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом:
 * сравниваются два соседних элемента ai и a(i + 1). Если ai <= a(i + 1),
 * то продвигаются на один элемент вперед. Если ai > a(i + 1),
 * то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */
class Task6 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 78, 11, 1, 2, 6, 7, 99};
        MethodsUnit2.printArray(array, "before: ");
        shellSort(array);
        MethodsUnit2.printArray(array, "after: ");
    }

    static void shellSort(int[] array) {
        for (int i = 0; i < array.length - 1; ) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }
}
