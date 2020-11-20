package unit1.branching;

/**
 * 2. Найти max{min(a, b), min(c, d)}.
 */
public class Task2 {
    public static void main(String[] args) {
        int result = task2(1, 2, 3, 4);
        System.out.println(result);
    }

    static int task2(int a, int b, int c, int d) {
        return max(min(a, b), min(c, d));
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}
