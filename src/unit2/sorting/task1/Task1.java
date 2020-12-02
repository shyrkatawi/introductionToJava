package unit2.sorting.task1;


import unit2.MethodsUnit2;

/**
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 * Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
 * при этом не используя дополнительный массив.
 */
class Task1 {
    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] second = new int[]{66, 7, 8, 99};
        int position = 3;
        int[] result = task1(first, second, position);
        MethodsUnit2.printArray(first, "first array: ");
        MethodsUnit2.printArray(second, "second array: ");
        System.out.println("position: " + position);
        MethodsUnit2.printArray(result, "result: ");
    }

    static int[] task1(int[] firstArray, int[] secondArray, int insertPosition) {
        insertPosition--;

        int[] resultArray = new int[firstArray.length + secondArray.length];
        int index = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (i < insertPosition) {
                resultArray[i] = firstArray[i];
            } else if (index < secondArray.length) {
                resultArray[i] = secondArray[index];
                index++;
            } else {
                resultArray[i] = firstArray[insertPosition];
                insertPosition++;
            }
        }
        return resultArray;
    }
}
