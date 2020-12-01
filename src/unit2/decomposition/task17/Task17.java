package unit2.decomposition.task17;

/**
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 */
class Task17 {
    public static void main(String[] args) {
        System.out.println(task17(26));
    }

    static int task17(int number) {
        int digitsSum = getSumFromNumberDigits(number);
        int subtractionCounter = 0;
        while (number > 0) {
            number -= digitsSum;
            subtractionCounter++;
            System.out.println(number);
        }
        return subtractionCounter;
    }

    static int getSumFromNumberDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
