package unit2.multiArrays;

class Task1 {
    //    1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    static void task1(int[][] matrix) {
        Main.showMatrix(matrix);
        for (int i = 0; i < matrix.length; i+=2) {
            if (matrix[0][i] > matrix[matrix.length - 1][i]) {
                for (int k = 0; k < matrix.length; k++) {
                    System.out.println(matrix[k][i]);
                }
                System.out.println();
            }
        }
    }
}
