package unit2.multiArrays;

/**
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 */
class Task10 {
    static void task10(int[][] matrix) {
        Main.showMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            int mainDiagonalElement = matrix[i][i];
            if (mainDiagonalElement > 0) {
                System.out.println(mainDiagonalElement);
            }
        }
    }
}
