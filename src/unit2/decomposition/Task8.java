package unit2.decomposition;

public class Task8 {
    //8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    //Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
    static void task8(int[] array) {
        if (array.length > 0 && array.length % 3 == 0) {
            Main.showIntArray(array, "Исходный массив");
            for (int i = 0; i < array.length; i += 3) {
                int sum = getSumOfThreeArrayElements(array, i, i + 2);
                System.out.printf("Сумма трех последовательно расположенных элементов массива с номерами от %d до %d равна %d\n", i + 1, i + 3, sum);
            }
        } else {
            System.out.println("Неверные входные данные.");
        }
    }

    private static int getSumOfThreeArrayElements(int[] array, int positionOfFirst, int positionOfThird) {
        int sum = 0;
        for (int i = positionOfFirst; i <= positionOfThird; i++) {
            sum += array[i];
        }
        return sum;
    }
}
