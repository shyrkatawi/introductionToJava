package unit2.multiArrays;

/**
 * 7. Сформировать квадратную матрицу порядка N по правилу:
 * и подсчитать количество положительных элементов в ней.
 */
class Task7 {
    static void task7(int size) {
        if (size > 1) {
            double[][] matrix = new double[size][size];
            int positiveNumberCounter = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int k = 0; k < matrix.length; k++) {
                    matrix[i][k] = Math.sin((double) (i * i - k * k) / matrix.length);
                    if (matrix[i][k] > 0) {
                        positiveNumberCounter++;
                    }
                }
            }
            Main.showMatrix(matrix);
            System.out.println("Number of positive elements " + positiveNumberCounter);
        } else {
            System.out.println("error: size must be even and more than 1");
        }
    }
}
