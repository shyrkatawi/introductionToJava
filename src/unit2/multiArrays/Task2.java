package unit2.multiArrays;

/**
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
class Task2 {
    static void task2(int[][] matrix) {
        Main.showMatrix(matrix);
        int[] mainDiagonal = new int[matrix.length];
        int[] sideDiagonal = new int[matrix.length];
        for (int i = 0; i < sideDiagonal.length; i++) {
            mainDiagonal[i] = matrix[i][i];
            sideDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        Main.showArray(mainDiagonal);
        Main.showArray(sideDiagonal);
    }
}
