package unit2.multiArrays;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[][] matrix = new int[5][5];
//        matrix[0] = new int[]{8, 1, 1, 1, 5};
//        matrix[1] = new int[]{1, 1, 3, 1, 1};
//        matrix[2] = new int[]{1, 2, 8, 4, 5};
//        matrix[3] = new int[]{1, 2, 3, 8, 5};
//        matrix[4] = new int[]{1, 2, 3, 4, 8};
//        showMatrix(matrix);

//        Task1.task1(createMatrix(7, 7, 9));
//        Task2.task2(createMatrix(5, 5, 9));
//        Task3.task3(createMatrix(5, 5, 9), 1, 5);
//        Task4.task4(6);
//        Task5.task5(6);
//        Task6.task6(8);
//        Task7.task7(7);
//        Task8.task8();
//        Task9.task9(createMatrix(5, 5, 9));
//        Task10.task10(createMatrix(5, 5, 9));
//        Task11.task11();
//        Task12.task12(createMatrix(5, 5, 9));
//        Task13.task13(createMatrix(5, 5, 9));
//        Task14.task14(5);
//        Task15.task15(createMatrix(8, 7, 9));
        Task16.task16(6);

    }

    static int[][] createMatrix(int rows, int columns, int maxValueOfElement) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = new Random().nextInt(maxValueOfElement + 1);
            }
        }
        return matrix;
    }

    static void showMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            showArray(array);
        }
        System.out.println();
    }

    static void showMatrix(int[][] matrix, String message) {
        System.out.println(message);
        for (int[] array : matrix) {
            showArray(array);
        }
        System.out.println();
    }

    static void showMatrix(double[][] matrix) {
        for (double[] array : matrix) {
            showArray(array);
        }
        System.out.println();
    }

    static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void showArray(double[] array) {
        for (double i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
