package unit2.decomposition.task8;

import unit2.MethodsUnit2;

/**
 * 8. Задан массив D.
 * Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы
 * трех последовательно расположенных элементов массива с номерами от k до m.
 */
class Task8 {
    public static void main(String[] args) {
        int[] sourceArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        MethodsUnit2.printArray(sourceArray);
        int result = getSumOfThreeArrayElements(sourceArray, 7, 3);
        System.out.println(result);
    }

    static int getSumOfThreeArrayElements(int[] array, int k, int range) {
        int startPosition = k - 1;
        int lastPosition = startPosition + range;
        if (startPosition < 0 || startPosition > array.length || lastPosition > array.length) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (int i = startPosition; i < lastPosition; i++) {
            sum += array[i];
        }
        return sum;
    }
}
