package unit2.multiArrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 {
    //    8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
    static void task8() {
        int[] data = getDataForTask8();
        if (data[0] != 0) {
            int rows = data[1];
            int columns = data[2];
            int columnA = data[3];
            int columnB = data[4];
            int[][] matrix = Main.createMatrix(rows, columns, 9);

            Main.showMatrix(matrix, "Матрица до перестановки");
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][columnA];
                matrix[i][columnA] = matrix[i][columnB];
                matrix[i][columnB] = temp;
            }
            Main.showMatrix(matrix, "Матрица после перестановки");
        }
    }

    static int[] getDataForTask8() {
//        Возвращает:
//        data[0] = маркер, указывающий на "введены ли верные данные" 0 = не введены, 1 = введены.
//        data[1] = количество строк для создания матрицы,
//        data[2] = количество столбцов для создания матрицы,
//        data[3] = номер первого столбца для замены,
//        data[4] = номер второго столбца для замены,
        int[] data = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите количество строк для создания матрицы, n > 1");
            int rows = sc.nextInt();
            System.out.println("Введите количество столбцов для создания матрицы, n > 1");
            int columns = sc.nextInt();
            if (columns > 1) {
                System.out.println("Введите номер первого столбца, n > 0 и n <= размера матрицы");
                int columnA = sc.nextInt();
                System.out.println("Введите номер второго столбца, n > 0 и n <= размера матрицы");
                int columnB = sc.nextInt();
                if (columnA < 1 || columnB < 1 || columnA > columns || columnB > columns) {
                    throw new InputMismatchException(" номера столбцов не соответствуют n > 0 и n <= количеству столбцов матрицы");
                } else {
                    data[0] = 1;
                    data[1] = rows;
                    data[2] = columns;
                    data[3] = columnA - 1;
                    data[4] = columnB - 1;
//                    уменьшил размер столбцов на 1, потому что в java отсчёт элеметнов начинается с 0, а в математике с 1.
                }
            } else {
                throw new InputMismatchException(" размер матрицы не соответствует n > 1");
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод данных:" + e.getMessage());
        }
        return data;
    }
}

