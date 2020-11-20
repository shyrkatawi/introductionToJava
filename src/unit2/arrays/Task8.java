package unit2.arrays;

public class Task8 {
    //8. Дана последовательность целых чисел a1, a2, ..., a(n).
    //Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ..., a(n)).
    static void task8(int[] array) {
        Main.showArray(array);
        int min = array[0];
        int minCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minCount = 1;
            } else if (min == array[i]) {
                minCount++;
            }
        }
        int[] result = new int[array.length - minCount];
        int position = 0;
        for (int i : array) {
            if (i > min) {
                result[position] = i;
                position++;
            }
        }
        Main.showArray(result);
    }
}