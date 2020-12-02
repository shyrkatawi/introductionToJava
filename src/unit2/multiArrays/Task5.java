package unit2.multiArrays;

/**
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
class Task5 {
    static void task5(int size) {
        if (size % 2 == 0 && size > 1) {
            int[][] matrix = new int[size][size];
            for (int i = 0; i < matrix.length; i++) {
                for (int k = 0; k < matrix.length - i; k++) {
                    matrix[i][k] = i + 1;
                }
            }
            Main.showMatrix(matrix);
        } else {
            System.out.println("error: size must be even and more than 1");
        }
    }
}
