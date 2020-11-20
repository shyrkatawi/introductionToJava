package unit2.decomposition;

public class Task12 {
    //12. Даны натуральные числа К и N.
    //Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
    static void task12(int k, int n) {
        int[] array = new int[n];
        int resultArrayLength = 0;
        for (int i = 0; i < n; i++) {
            if (k == getSumOfDigits(i)) {
                array[resultArrayLength] = i;
                resultArrayLength++;
            }
        }
        int[] resultArray = new int[resultArrayLength];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = array[i];
        }
        Main.showIntArray(resultArray, "Итоговый массив");
    }

    public static int getSumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
