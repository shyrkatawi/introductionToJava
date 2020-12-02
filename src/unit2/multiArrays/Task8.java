package unit2.multiArrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е.
 * все элементы одного столбца поставить на соответствующие им позиции другого,
 * а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры.
 */
class Task8 {
    static void task8() {
        int[] data = getDataForTask8();
        if (data[0] != 0) {
            int rows = data[1];
            int columns = data[2];
            int columnA = data[3];
            int columnB = data[4];
            int[][] matrix = Main.createMatrix(rows, columns, 9);

            Main.showMatrix(matrix, "before");
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][columnA];
                matrix[i][columnA] = matrix[i][columnB];
                matrix[i][columnB] = temp;
            }
            Main.showMatrix(matrix, "after");
        }
    }

    /**
     * returns:
     * data[0] = marker indicating "whether correct data was entered" 0 = not entered, 1 = entered.
     * data[1] = number of rows to create a matrix,
     * data[2] = number of columns to create a matrix,
     * data[3] = the first column number for replace,
     * data[4] = the second column number for replace.
     */
    static int[] getDataForTask8() {
        int[] data = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows to create the matrix, n > 1");
            int rows = sc.nextInt();
            System.out.println("Enter the number of columns to create the matrix, n > 1");
            int columns = sc.nextInt();
            if (columns > 1) {
                System.out.println("Enter the number of the first column, n > 0 and n <= matrix size");
                int columnA = sc.nextInt();
                System.out.println("Enter the number of the second column, n > 0 and n <= matrix size");
                int columnB = sc.nextInt();
                if (columnA < 1 || columnB < 1 || columnA > columns || columnB > columns) {
                    throw new InputMismatchException(" column numbers do not correspond to n > 0 and n <= the number of columns in the matrix");
                } else {
                    data[0] = 1;
                    data[1] = rows;
                    data[2] = columns;
                    data[3] = columnA - 1;
                    data[4] = columnB - 1;
                }
            } else {
                throw new InputMismatchException(" the size of the matrix does not correspond to n > 1");
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод данных:" + e.getMessage());
        }
        return data;
    }
}

