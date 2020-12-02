package unit2.sorting.task2;

import unit2.MethodsUnit2;

/**
 * 2. Даны две последовательности (неубывающие).
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.
 */
class Task2 {
    public static void main(String[] args) {
        int[] first = new int[]{1, 3, 4, 5, 7, 8};
        int[] second = new int[]{1, 2, 6, 7, 99};
        int[] result = task2(first, second);
        MethodsUnit2.printArray(first, "first array: ");
        MethodsUnit2.printArray(second, "second array: ");
        MethodsUnit2.printArray(result, "result: ");
    }

    static int[] task2(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int index = 0;
        for (int i : firstArray) {
            resultArray[index] = i;
            index++;
        }
        for (int k : secondArray) {
            resultArray[index] = k;
            index++;
        }
        arraySort(resultArray);
        return resultArray;
    }

    static void arraySort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
    }
}
