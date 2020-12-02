package unit2.multiArrays;

/**
 * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
class Task13 {
    static void task13(int[][] matrix) {
        Main.showMatrix(matrix, "Matrix before sorting");
        Main.showMatrix(columnsSortUp(matrix), "Matrix after sorting columns in ascending order of elements");
        Main.showMatrix(columnsSortDown(matrix), "Matrix after sorting columns in descending order of elements");
    }

    static int[][] columnsSortUp(int[][] matrix) {
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

    static int[][] columnsSortDown(int[][] matrix) {
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
