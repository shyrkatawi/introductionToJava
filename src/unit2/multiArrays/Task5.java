package unit2.multiArrays;

public class Task5 {
    //    5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    static void task5(int size) {
        if (size % 2 == 0 && size > 1) {
            int[][] matrix = new int[size][size];
            for (int i = 0; i < matrix.length; i++) {
                for (int k = 0; k < matrix.length-i; k++) {
                        matrix[i][k] = i + 1;
                    }
                }
            Main.showMatrix(matrix);
        } else {
            System.out.println("Неверный размер матрицы, размер должен быть чётным и больше 1");
        }
    }
}
