package unit2.decomposition.task7;

/**
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
class Task7 {
    public static void main(String[] args) {
        int result = sumOfFactorialsInRange(1, 9, true);
        System.out.println("Result: " + result);
    }

    static int sumOfFactorialsInRange(int min, int max, boolean isOdd) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (isOdd) {
                if (i % 2 != 0) {
                    sum += getFactorial(i);
                }
            } else {
                if (i % 2 == 0) {
                    sum += getFactorial(i);
                }
            }
        }
        return sum;
    }

    static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
