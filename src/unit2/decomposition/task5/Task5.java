package unit2.decomposition.task5;

import unit2.MethodsUnit2;

/**
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
class Task5 {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{5, 1, 6, 3, 4};
        MethodsUnit2.printArray(sourceArray);
        int result = getSecondMaxFromArray(sourceArray);
        System.out.println("Second max number in array: " + result);
    }

    static int getSecondMaxFromArray(int[] array) throws IllegalArgumentException{
        if (array.length < 2) {
            throw new IllegalArgumentException("array length must be more that 1");
        }
        int max;
        int secondMax;
        if (array[0] > array[1]) {
            max = array[0];
            secondMax = array[1];
        } else {
            max = array[1];
            secondMax = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            int element = array[i];
            if (element > secondMax) {
                secondMax = element;
                if (element > max) {
                    int tmp = max;
                    max = element;
                    secondMax = tmp;
                }
            }
        }
        return secondMax;
    }
}
