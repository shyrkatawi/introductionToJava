package unit1.branching;

/**
 * 5. Вычислить значение функции:
 * x^2 - 3x + 9, если x <= 3;
 * 1/(x^3 + 6), если x > 3.
 */
public class Task5 {
    public static void main(String[] args) {
        double result = task5(3);
        System.out.println(result);
    }

    static double task5(int x) {
        double result;
        if (x <= 3) {
            result = firstFormula(x);
        } else {
            result = secondFormula(x);
        }
        return result;
    }

    private static double firstFormula(int x) {
        return x * x - 3 * x + 9;
    }

    private static double secondFormula(int x) {
        return 1.0 / (x * x * x + 6);
    }
}
