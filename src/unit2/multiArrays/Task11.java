package unit2.multiArrays;

public class Task11 {
    //    11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
    static void task11() {
        int[][] matrix = Main.createMatrix(10, 20, 14);
        Main.showMatrix(matrix);

        int value = 5;
        int minNumberOfValue = 3;
        for (int i = 0; i < matrix.length; i++) {
            int numberOfValueInRow = 0;
            for (int k = 0; k < matrix[i].length; k++) {
                if (matrix[i][k] == value) {
                    numberOfValueInRow++;
                }
            }
            if (numberOfValueInRow >= minNumberOfValue) {
                System.out.printf("Строка №%d содержит значение \"%d\" %d раз.\n",(i+1),value,numberOfValueInRow);
            }
        }
    }
}
