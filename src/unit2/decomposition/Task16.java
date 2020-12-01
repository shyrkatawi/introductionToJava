package unit2.decomposition;

class Task16 {
    //16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    //Определить также, сколько четных цифр в найденной сумме.
    //Для решения задачи использовать декомпозицию.
    static void task16(int... array) {
        Main.showIntArray(array, "Исходные числа: ");
        int sum = 0;
        for (int i : array) {
            if (isContainsOnlyOddDigits(i)) {
                sum+=i;
            }
        }
        System.out.printf("Сумма чисел, содержащих только нечетные цифры: %d\n",sum);
        System.out.printf("Количество чётных цифр в найденной сумме: %d\n",getAmountOfEvenDigits(sum));
    }

    static boolean isEven(int i) {
        return i % 2 == 0;
    }

    static int getAmountOfEvenDigits(int i) {
        int amount = 0;
        if (i == 0) {
            amount++;
        } else {
            while (i > 0) {
                int digit = i % 10;
                if (isEven(digit)) {
                    amount++;
                }
                i /= 10;
            }
        }
        return amount;
    }

    static boolean isContainsOnlyOddDigits(int i) {
        boolean result = true;
        while (i > 0) {
            int digit = i % 10;
            if (isEven(digit)) {
                result = false;
                break;
            }
            i /= 10;
        }
        return result;
    }
}
