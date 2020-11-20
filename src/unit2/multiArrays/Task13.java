package unit2.multiArrays;

public class Task13 {
    //    13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
    static void task13(int[][] matrix) {
        Main.showMatrix(matrix, "Матрица до сортировки");
        Main.showMatrix(columnsSortUp(matrix), "Матрица после сортировки столбцов по возрастанию элементов");
        Main.showMatrix(columnsSortDown(matrix), "Матрица после сортировки столбцов по убыванию элементов");
    }

    private static int[][] columnsSortUp(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            boolean isSorted = false;
            int tmp;
            while (!isSorted) {
                isSorted = true;
                for (int k = 0; k < matrix.length - 1; k++) {
                    if (matrix[k][i] > matrix[k + 1][i]) {
                        isSorted = false;
                        tmp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = tmp;
                    }
                }
            }
        }
        return matrix;
    }

    private static int[][] columnsSortDown(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            boolean isSorted = false;
            int tmp;
            while (!isSorted) {
                isSorted = true;
                for (int k = 0; k < matrix.length - 1; k++) {
                    if (matrix[k][i] < matrix[k + 1][i]) {
                        isSorted = false;
                        tmp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = tmp;
                    }
                }
            }
        }
        return matrix;
    }
}
