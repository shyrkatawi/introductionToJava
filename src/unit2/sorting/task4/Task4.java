package unit2.sorting.task4;

import unit2.MethodsUnit2;

/**
 * 4. Сортировка обменами.
 * Дана последовательность чисел (неубывающая).
 * Требуется переставить числа в порядке возрастания.
 * Для этого сравниваются два соседних числа a(i) и a(i + 1).
 * Если a(i) > a(i + 1), то делается перестановка.
 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количество перестановок.
 */
class Task4 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 78, 11, 1, 2, 6, 7, 99};
        MethodsUnit2.printArray(array, "before: ");
        bubbleSort(array);
        MethodsUnit2.printArray(array, "after: ");
    }

    static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int swapAmount = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                    swapAmount++;
                }
            }
        }
        System.out.println("amount of swap: " + swapAmount);
    }
}
