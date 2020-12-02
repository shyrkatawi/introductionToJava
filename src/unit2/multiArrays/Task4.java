package unit2.multiArrays;

/**
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
class Task4 {
    static void task4(int size) {
        if (size % 2 == 0 && size > 1) {
            int[][] matrix = new int[size][size];
            for (int i = 0; i < matrix.length; i++) {
                for (int k = 0; k < matrix.length; k++) {
                    if (i % 2 == 0) {
                        matrix[i][k] = k + 1;
                    } else {
                        matrix[i][k] = matrix.length - k;
                    }
                }
            }
            Main.showMatrix(matrix);
        } else {
            System.out.println("error: size must be even and more than 1");
        }
    }
}
