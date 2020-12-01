package unit2.arrays.task9;

import unit2.MethodsUnit2;

/**
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */
class Task9 {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{4, 4, 1, 2, 2, 4, 5, 3, 7, 2, 8, 3, 5, 1};
        MethodsUnit2.printArray(sourceArray, "Source array: ");
        int result = findMostCommonNumber(sourceArray);
        System.out.println(result);
    }

    /**
     * Find the most common numbers.
     * If there are several such numbers, then determine the smallest of them.
     */
    static int findMostCommonNumber(int[] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException();
        }
        if (array.length == 1) {
            return array[0];
        }
        int mostCommon = array[0];
        int counter = 0;
        int counterPrev = 0;
        for (int i : array) {
            for (int k : array) {
                if (i == k) {
                    counter++;
                }
            }
            if (counter > counterPrev) {
                mostCommon = i;
                counterPrev = counter;
            } else if (counter == counterPrev && i < mostCommon) {
                mostCommon = i;
            }
            counter = 0;
        }
        return mostCommon;
    }
}
