package unit2.decomposition;

class Task15 {
    //15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
    //Для решения задачи использовать декомпозицию.
    static void task15(int... array) {
        Main.showIntArray(array, "Исходные числа: ");
        for (int i : array) {
            if (isIncreasingSequence(i)) {
                System.out.println("Число, в котором цифры образуют строго возрастающую последовательность: " + i);
            }
        }
    }

    static boolean isIncreasingSequence(int i) {
        boolean result = true;
        int max = 10;
        while (i > 0) {
            int digit = i % 10;
            if (max <= digit) {
                result = false;
                break;
            }
            max = digit;
            i /= 10;
        }
        return result;
    }
}
