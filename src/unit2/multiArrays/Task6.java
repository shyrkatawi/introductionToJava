package unit2.multiArrays;

/**
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
class Task6 {
    static void task6(int size) {
        if (size % 2 == 0 && size > 1) {
            int[][] matrix = new int[size][size];
            for (int i = 0; i < matrix.length; i++) {
                for (int k = 0; k < matrix.length; k++) {
                    if ((k >= i && k + i < matrix.length) || (k <= i && k + i >= matrix.length - 1)) {
                        matrix[i][k] = 1;
                    }
                }
            }
            Main.showMatrix(matrix);
        } else {
            System.out.println("error: size must be even and more than 1");
        }
    }
}
