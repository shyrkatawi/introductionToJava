package unit2.multiArrays;

/**
 * 9. Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму.
 */
class Task9 {
    static void task9(int[][] matrix) {
        Main.showMatrix(matrix);
        int maxSum = 0;
        int columnWithMaxSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int tempSum = 0;
            for (int[] array : matrix) {
                tempSum += array[i];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                columnWithMaxSum = i;
            }
            System.out.printf("column №%d has sum %d\n", (i + 1), tempSum);
        }
        System.out.println("\ncolumn with max sum : " + (columnWithMaxSum + 1));
    }
}
