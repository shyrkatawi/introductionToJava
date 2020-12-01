package unit1.cycles;

/**
 * 5. Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 */
class Task5 {
    public static void main(String[] args) {
        double result = task5(5, 7);
        System.out.println(result);
    }

    static double task5(int n, int e) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double a = calculateA(i);
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        return sum;
    }

    private static double calculateA(int i) {
        return 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
    }
}
