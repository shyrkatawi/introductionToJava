package unit2.decomposition.task1;

/**
 * 1. Написать метод(методы) для нахождения
 * наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел:
 */
class Task1 {
    public static void main(String[] args) {
        int i1 = 9;
        int i2 = 12;
        System.out.printf("НОД %d %d = %d\n", i1, i2, nod(i1, i2));
        System.out.printf("НОК %d %d = %d\n", i1, i2, nok(i1, i2));
    }

    static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }

    static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }
}
