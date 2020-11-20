package unit2.multiArrays;

public class Task12 {
    //    12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    static void task12(int[][] matrix) {
        Main.showMatrix(matrix, "Матрица до сортировки");
        Main.showMatrix(rowsSortUp(matrix), "Матрица после сортировки строк по возрастанию элементов");
        Main.showMatrix(rowsSortDown(matrix), "Матрица после сортировки строк по убыванию элементов");
    }

    private static int[][] rowsSortUp(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean isSorted = false;
            int tmp;
            while (!isSorted) {
                isSorted = true;
                for (int k = 0; k < matrix[i].length - 1; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        isSorted = false;
                        tmp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = tmp;
                    }
                }
            }
        }
        return matrix;
    }

    private static int[][] rowsSortDown(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            boolean isSorted = false;
            int tmp;
            while (!isSorted) {
                isSorted = true;
                for (int k = 0; k < matrix[i].length - 1; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        isSorted = false;
                        tmp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = tmp;
                    }
                }
            }
        }
        return matrix;
    }
}
