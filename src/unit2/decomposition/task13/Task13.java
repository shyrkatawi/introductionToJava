package unit2.decomposition.task13;


/**
 * 13. Два простых числа называются «близнецами»,
 * если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 */
class Task13 {
    public static void main(String[] args) {
        task13(40);
    }

    static void task13(int n) {
        for (int i = n; i < (n * 2) - 1; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.printf("%d %d\n", i, i + 2);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
