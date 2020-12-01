package unit2.arrays.task8;

import unit2.MethodsUnit2;

/**
 * 8. Дана последовательность целых чисел a1, a2, ..., a(n).
 * Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ..., a(n)).
 */
class Task8 {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{1, 1, 2, 4, 5, 3, 7, 8, 3, 5};
        MethodsUnit2.printArray(sourceArray, "Source array: ");
        int[] result = task8(sourceArray);
        MethodsUnit2.printArray(result, "Result array: ");
    }

    static int[] task8(int[] array) {
        if (array.length < 2) {
            return new int[0];
        }
        int min = array[0];
        int minCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minCount = 1;
            } else if (min == array[i]) {
                minCount++;
            }
        }
        int[] result = new int[array.length - minCount];
        int position = 0;
        for (int i : array) {
            if (i != min) {
                result[position] = i;
                position++;
            }
        }
        return result;
    }
}