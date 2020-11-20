package unit2.decomposition;

public class Task17 {
    //17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
    //Сколько таких действий надо произвести, чтобы получился нуль?
    //Для решения задачи использовать декомпозицию.
    static void task17(int number) {
        int digitsSum = getSumFromNumberDigits(number);
        int subtractionCounter = 0;
        while (number>0){
            number-=digitsSum;
            subtractionCounter++;
        }
        System.out.println(digitsSum);
        System.out.println(subtractionCounter);
    }

    private static int getSumFromNumberDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            System.out.println(digit);
            number /= 10;
        }
        return sum;
    }
}
