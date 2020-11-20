package unit2.decomposition;

public class Task7 {
    //7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
    static void task7() {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                sum += getFactorial(i);
            }
        }
        System.out.printf("Сумма факториалов всех нечетных чисел от 1 до 9 равна %d\n", sum);
    }

    static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
