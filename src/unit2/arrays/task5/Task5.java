package unit2.arrays.task5;

import unit2.MethodsUnit2;

/**
 * 5. Даны целые числа а1, а2 ,..., аn .
 * Вывести на печать только те числа, для которых аi > i.(больше своего индекса)
 */
class Task5 {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{1, 0, 3, 4, 0, 0, -1, -2, -3};
        MethodsUnit2.printArray(sourceArray, "source");
        int[] resultArray = getArrayWithNumbersGreaterThanItsIndex(sourceArray);
        MethodsUnit2.printArray(resultArray, "result");
    }

    static int[] getArrayWithNumbersGreaterThanItsIndex(int[] array) {
        int[] tmpArray = new int[array.length];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                tmpArray[position] = array[i];
                position++;
            }
        }
        int[] resultArray = new int[position];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = tmpArray[i];
        }
        return resultArray;
    }
}
