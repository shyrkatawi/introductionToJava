package unit2.decomposition.task10;

import unit2.MethodsUnit2;

/**
 * 10. Дано натуральное число N.
 * Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */
class Task10 {
    public static void main(String[] args) {
        int i = 1234;
        int[] resultArray = task10(i);
        MethodsUnit2.printArray(resultArray, "Result array: ");
    }

    static int[] task10(int n) {
        int countOfDigits = getAmountOfDigits(n);
        int[] array;
        array = new int[countOfDigits];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = n % 10;
            n /= 10;
        }
        return array;
    }

    static int getAmountOfDigits(int n) {
        int amount = 0;
        if (n < 10) {
            amount++;
        } else {
            while (n != 0) {
                amount++;
                n /= 10;
            }
        }
        return amount;
    }
}
