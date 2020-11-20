package unit2.decomposition;

public class Task1 {
    //1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
    static void task1(int i1, int i2) {
        int nod = nod(i1,i2);
        int nok = nok(i1,i2);
        System.out.printf("НОД для чисел %d %d равно %d\n", i1, i2, nod);
        System.out.printf("НОК для чисел %d %d равно %d\n", i1, i2, nok);
    }

    private static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }

    private static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }
}
