package unit2.sorting;

public class Task1 {
    //1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
    //Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.
    static void task1(int[] firstArray, int[] secondArray, int insertPosition) {
        Main.showIntArray(firstArray, "Первый массив:");
        Main.showIntArray(secondArray, "Второй массив:");
        System.out.println("Позиция для вставки массива: " + insertPosition);
        insertPosition--;

        int[] resultArray = new int[firstArray.length + secondArray.length];
        int index = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if(i < insertPosition){
                resultArray[i] = firstArray[i];
            } else if( index < secondArray.length){
                resultArray[i] = secondArray[index];
                index++;
            } else {
                resultArray[i] = firstArray[insertPosition];
                insertPosition++;
            }
        }
        Main.showIntArray(resultArray, "Итоговый массив ");
    }
}
