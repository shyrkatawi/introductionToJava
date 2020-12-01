package unit2.arrays.task10;

import unit2.MethodsUnit2;

/**
 * 10. Дан целочисленный массив с количеством элементов n.
 * Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание: Дополнительный массив не использовать.
 */
class Task10 {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        MethodsUnit2.printArray(sourceArray,"Source array: ");
        compressArray(sourceArray);
        MethodsUnit2.printArray(sourceArray, "Array after compress: ");
    }

    static void compressArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (i * 2 < array.length) {
                array[i] = array[i * 2];
            } else {
                array[i] = 0;
            }
        }
    }
}
