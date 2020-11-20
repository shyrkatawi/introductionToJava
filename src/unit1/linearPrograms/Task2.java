package unit1.linearPrograms;

/**
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 * b+√(b^2+4ac)/2a - a^3c+b^-2.
 * */
public class Task2 {
    public static void main(String[] args) {
        double result = task2(2, 3, 4);
        System.out.println(result);
    }

    static double task2(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
