package unit2.arrays;

/**
 * 2. Дана последовательность действительных чисел а1, а2, ..., аn.
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

//adaweawr
public class Task2 {
    public static void main(String[] args) {
        task2(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2);
    }

    static void task2(double[] array, double z) {
        Main.showArray(array, "source array");
        int replaceCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                replaceCounter++;
            }
        }
        Main.showArray(array, "result array");
        System.out.println("Количество замен: " + replaceCounter);
    }
}