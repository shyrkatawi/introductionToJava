package unit2.sorting;

public class Task3 {
    //3. Сортировка выбором. Дана последовательность чисел (неубывающая). Требуется переставить элементы так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
    static void task3(int[] array) {
        Main.showIntArray(array, "Исходный массив");
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxPosition = i;
            for (int k = i; k < array.length; k++) {
                if (array[k] > max ) {
                    max = array[k];
                    maxPosition = k;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[maxPosition] = temp;
        }
        Main.showIntArray(array, "Отсортированный массив с помощью \"сортировка выбором\"");
    }
}
