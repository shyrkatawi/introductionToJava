package unit2.multiArrays;

public class Task9 {
    //    9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.
    static void task9(int[][] matrix) {
        Main.showMatrix(matrix);
        int maxSum = 0;
        int columnWithMaxSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int tempSum = 0;
            for (int k = 0; k < matrix.length; k++) {
                tempSum += matrix[k][i];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                columnWithMaxSum = i;
            }
            System.out.printf("Столбец №%d имеет сумму %d\n", (i + 1), tempSum);
        }
        System.out.println("\nСтолбец с максимальной суммой: " + (columnWithMaxSum + 1));
    }
}
