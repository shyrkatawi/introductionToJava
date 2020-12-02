package unit2.multiArrays;

/**
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
class Task15 {
    static void task15(int[][] matrix) {
        Main.showMatrix(matrix);
        int max = 0;
        for (int[] array : matrix) {
            for (int i : array) {
                if (i > max) {
                    max = i;
                }
            }
        }
        int oddCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                oddCounter++;
                if (oddCounter % 2 != 0) {
                    matrix[i][k] = max;
                }
            }
        }
        Main.showMatrix(matrix);
    }
}
