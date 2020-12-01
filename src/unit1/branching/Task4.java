package unit1.branching;


/**
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
class Task4 {
    public static void main(String[] args) {
        boolean result = task4(1, 2, 3, 4, 5);
        if (result) {
            System.out.println("The brick will pass through the hole");
        } else {
            System.out.println("The brick will not pass through the hole");
        }
    }

    static boolean task4(int a, int b, int x, int y, int z) {
        boolean firstCondition = (a > x && b > y) || (a > x && b > z);
        boolean secondCondition = (a > y && b > x) || (a > y && b > z);
        boolean thirdCondition = (a > z && b > y) || (a > z && b > x);
        return (firstCondition || secondCondition || thirdCondition);
    }
}
