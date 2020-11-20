package unit2.sorting;

public class Task4 {
    //4. Сортировка обменами. Дана последовательность чисел (неубывающая). Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа a(i) и a(i + 1). Если a(i) > a(i + 1), то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количество перестановок.
    static void task4(int[] array) {
        Main.showIntArray(array, "Исходный массив");
        boolean isSorted = false;
        int swapAmount = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                    swapAmount++;
                }
            }
        }
        Main.showIntArray(array, "Отсортированный массив с помощью \"сортировка обменами\"");
        System.out.println("Количество перестановок "+swapAmount);
    }
}
