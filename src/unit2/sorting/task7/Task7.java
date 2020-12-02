package unit2.sorting.task7;

import unit2.MethodsUnit2;

import java.util.Arrays;

/**
 * 7. Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
 * Требуется указать те места, на которые нужно вставлять элементы последовательности
 * b1 <= b2 <= ... <= bm в первую последовательность так,
 * чтобы новая последовательность оставалась возрастающей.
 */
class Task7 {
    public static void main(String[] args) {
        int[] first = {1, 5, 6, 7};
        int[] second = {2, 3};
        int[] result = task7(first, second);

        MethodsUnit2.printArray(first);
        MethodsUnit2.printArray(second);
        MethodsUnit2.printArray(result);
    }

    static int[] task7(int[] firstArray, int[] secondArray) {
        int[] resultArray = Arrays.copyOf(firstArray,firstArray.length);
        for (int element : secondArray) {
            int pointInsert = nextInsert(resultArray, element);
            int[] tempArray = new int[resultArray.length + 1];
            for (int i = 0; i < resultArray.length; i++) {
                if (pointInsert > i) {
                    tempArray[i] = resultArray[i];
                } else if (pointInsert == i) {
                    tempArray[i] = element;
                    tempArray[i + 1] = resultArray[i];
                } else {
                    tempArray[i + 1] = resultArray[i];
                }
            }
            resultArray = tempArray;
        }
        return resultArray;
    }

    static int nextInsert(int[] array, int element) {
        int k = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            k = (firstIndex + lastIndex) / 2;
            if (array[k] == element) {
                return k;
            } else if (array[k] < element) {
                firstIndex = k + 1;
            } else if (array[k] > element && k != 0 && !(array[k - 1] < element)) {
                lastIndex = k - 1;
            } else {
                break;
            }
        }
        return k;
    }
}
