package unit2.arrays;

public class Main {
    public static void main(String[] args) {
//        Task5.task5(new int[]{1, 2, 3, 4, 0, 0, -1, -2, -3});
//        Task7.task7(new int[]{1, 2, 2, 4, 5, 3, 7, 8, 3, 5});
        Task8.task8(new int[]{1, 1, 2, 4, 5, 3, 7, 8, 3, 5});
//        Task9.task9(new int[]{4,4,1, 2, 2, 4, 5, 3, 7, 2, 8, 3, 5, 1});
//        Task10.task10(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void showArray(double[] array, String message) {
        System.out.println(message);
        for (double d : array) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
