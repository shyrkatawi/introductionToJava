package unit2.multiArrays;

/**
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
class Task1 {
    static void task1(int[][] matrix) {
        Main.showMatrix(matrix);
        for (int i = 0; i < matrix.length; i += 2) {
            if (matrix[0][i] > matrix[matrix.length - 1][i]) {
                for (int[] array : matrix) {
                    System.out.println(array[i]);
                }
                System.out.println();
            }
        }
    }
}
