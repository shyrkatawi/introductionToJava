package unit2.multiArrays;

import java.util.Arrays;

public class Task7 {
//    7. Сформировать квадратную матрицу порядка N по правилу: и подсчитать количество положительных элементов в ней.
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
            System.out.println("Количество положительных элементов "+positiveNumberCounter);
        } else {
            System.out.println("Неверный размер матрицы, размер должен быть больше 1");
        }
    }
}
