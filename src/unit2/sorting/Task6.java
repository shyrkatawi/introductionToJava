package unit2.sorting;

public class Task6 {
    //6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это следующим образом: сравниваются два соседних элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
    static void task6(int[] array) {
        Main.showIntArray(array, "Исходный массив");
        for (int i = 0; i < array.length - 1; ) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        Main.showIntArray(array,"Отсортированный массив с помощью \"cортировка Шелла\"");
    }
}
