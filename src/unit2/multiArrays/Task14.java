package unit2.multiArrays;

public class Task14 {
    //    14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
    //    условие задания невыполнимо при m < n, поэтому я создаю квадратную матрицу
    static void task14(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        Main.showMatrix(matrix);
        for (int i = 0; i < matrix[0].length; i++) {
            int tmp = i + 1;
            for (int k = 0; k < matrix.length; k++) {
                if (tmp == 0) {
                    matrix[k][i] = 0;
                } else if (matrix.length - k == tmp) {
                    matrix[k][i] = 1;
                    tmp--;
                } else {
                    matrix[k][i] = (int) (Math.random() * 2);
                    if (matrix[k][i] == 1) {
                        tmp--;
                    }
                }

            }
        }
        Main.showMatrix(matrix);
    }
}
