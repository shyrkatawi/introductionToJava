package unit2.multiArrays;

/**
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
class Task3 {
    static void task3(int[][] matrix, int row, int column) {
        Main.showMatrix(matrix);
        System.out.println("row " + row);
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[row - 1][i] + " ");
        }

        System.out.println("\ncolumn " + column);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][column - 1]);
        }
        System.out.println();
    }


}
