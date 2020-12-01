package unit2.decomposition.task11;

/**
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
class Task11 {
    public static void main(String[] args) {
        int first = 123;
        int second = 111;
        int compareResult = compareNumbersByNumberOfDigits(first, second);
        if (compareResult == -1) {
            System.out.printf("number %d has more digits than number %d\n", second, first);
        } else if (compareResult == 0) {
            System.out.printf("number %d has the same number of digits as number %d\n", second, first);
        } else {
            System.out.printf("number %d has more digits than number %d\n", first, second);
        }
    }

    /**
     * returns:
     * -1 if the first number has less digits than the second
     * 0 if the first number has the same number of digits as the second
     * 1 if the first number has more digits than the second
     */
    static int compareNumbersByNumberOfDigits(int first, int second) {
        int firstCountOfDigits = getAmountOfDigits(first);
        int secondCountOfDigits = getAmountOfDigits(second);
        if (firstCountOfDigits < secondCountOfDigits) {
            return -1;
        } else if (firstCountOfDigits == secondCountOfDigits) {
            return 0;
        } else {
            return 1;
        }
    }

    static int getAmountOfDigits(int n) {
        int amount = 0;
        if (n < 10) {
            amount++;
        } else {
            while (n != 0) {
                amount++;
                n /= 10;
            }
        }
        return amount;
    }
}
