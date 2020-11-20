package unit2.decomposition;

public class Main {
    public static void main(String[] args) {
//        Task1.task1(12,9);
//        Task2.task2(18,48,96,222);
//        Task3.task3(3);
//        Task4.task4(new int[][]{new int[]{1, 2, 3, 4,-7}, new int[]{-1, 16, -3, 5,7}});
//        Task5.task5(new int[]{5, 1, 6, 3, 4});
//        Task6.task6(8, 15, 49);
//        Task6.task6(5, 15, 35);
//        Task7.task7();
//        ask8.task8(new int[]{1, 2, 3, 4, 5,6,7,8,9});
//        Task9.task9(1, 2, 3, 4);
//        Task10.task10(1);
//        Task11.task11(111,22);
//        Task11.task11(1,23);
//        Task11.task11(33,44);
//        Task12.task12(6, 77);
//        Task13.task13(40);
        Task14.task14(410);
//        Task15.task15(11,123,321,313,359,120);
//        Task16.task16(11,123,4444,333,-11,359);
//        Task17.task17(11);
    }

    static void showMatrix(int[][] matrix, String message) {
        System.out.println(message);
        for (int[] array : matrix) {
            showArray(array);
        }
        System.out.println();
    }

    static void showIntArray(int[] array, String message) {
        System.out.println(message);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
