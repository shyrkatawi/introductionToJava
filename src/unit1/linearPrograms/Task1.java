package unit1.linearPrograms;

/**
 * 1. Найдите значение функции: z = ( (a - 3) * b / 2) + c.
 */
public class Task1 {
    public static void main(String[] args) {
        double result = task1(1, 2, 3);
        System.out.println(result);
    }

    static double task1(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}
//    public static void main(String[] args) {
//        System.out.println();
//        System.out.println(task1(-1,-2,-3));
//        System.out.println(task1(0,0,0));
//    }
//
