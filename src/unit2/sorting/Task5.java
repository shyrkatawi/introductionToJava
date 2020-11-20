package unit2.sorting;

public class Task5 {
    //5. Сортировка вставками. Дана последовательность чисел a1, a2, a3, ... an. Требуется переставить числа в порядке возрастания. Делается это следующим образом. Пусть a1, a2,..., ai - упорядоченная последовательность, т. е. a1 <= a2 <= ... <= ai. Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
    static void task5(int[] array) {
        Main.showIntArray(array, "Исходный массив");
        for (int i = 0; i < array.length; i++) {
            int index = search(array, i);
            int temp = array[i];
            for (int k = i; k > index; k--) {
                array[k] = array[k - 1];
            }
            array[index] = temp;
        }
        Main.showIntArray(array, "Отсортированный массив с помощью \"сортировка вставками\"");
    }

    private static int search(int[] array, int i) {
        int low = 0;
        int key = array[i];
        int high = i;
        while (low < high) {
            int middle = (high + low) / 2;
            if (array[middle] > key)
                high = middle;
            else
                low = middle + 1;
        }
        return low;
    }
}
