package unit2.multiArrays;

/**
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
class Task12 {
    static void task12(int[][] matrix) {
        Main.showMatrix(matrix, "Matrix before sorting");
        Main.showMatrix(rowsSortUp(matrix), "Matrix after sorting rows in ascending order of elements");
        Main.showMatrix(rowsSortDown(matrix), "Matrix after sorting rows in descending order of elements");
    }

    static int[][] rowsSortUp(int[][] matrix) {
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

    static int[][] rowsSortDown(int[][] matrix) {
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
