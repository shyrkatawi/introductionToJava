package unit2.decomposition.task12;

import unit2.MethodsUnit2;

/**
 * 12. Даны натуральные числа К и N.
 * Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
class Task12 {
    public static void main(String[] args) {
        int[] result = task12(0, 77);
        MethodsUnit2.printArray(result, "Result array: ");
    }

    static int[] task12(int k, int n) {
        int[] array = new int[n];
        int resultArrayLength = 0;
        for (int i = 1; i < n; i++) {
            if (k == getSumOfDigits(i)) {
                array[resultArrayLength] = i;
                resultArrayLength++;
            }
        }
        int[] resultArray = new int[resultArrayLength];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = array[i];
        }
        return resultArray;
    }

    static int getSumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
