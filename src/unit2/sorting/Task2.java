package unit2.sorting;

public class Task2 {
    //2. Даны две последовательности (неубывающие).
    // Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
    // Примечание. Дополнительный массив не использовать.
    static void task2(int[] firstArray, int[] secondArray) {
        Main.showIntArray(firstArray, "Первый массив:");
        Main.showIntArray(secondArray, "Второй массив:");

        int[] resultArray = new int[firstArray.length + secondArray.length];
        int index = 0;
        for (int i : firstArray) {
            resultArray[index] = i;
            index++;
        }
        for (int k : secondArray) {
            resultArray[index] = k;
            index++;
        }

        Main.arraySort(resultArray);
        Main.showIntArray(resultArray, "Итоговый массив ");
    }
}
