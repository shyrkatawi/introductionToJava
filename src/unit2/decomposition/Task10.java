package unit2.decomposition;

public class Task10 {
    //10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
    static void task10(int n) {
        int countOfDigits = getAmountOfDigits(n);
        int[] resultArray;
        if (countOfDigits == 1) {
            resultArray = new int[]{countOfDigits};
        } else {
            resultArray = new int[countOfDigits];
            for (int i = resultArray.length - 1; i >= 0; i--) {
                resultArray[i] = n % 10;
                n /= 10;
            }
        }
        Main.showIntArray(resultArray, "Итоговый массив");
    }

    private static int getAmountOfDigits(int n) {
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
