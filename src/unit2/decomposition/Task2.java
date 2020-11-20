package unit2.decomposition;

public class Task2 {
    //2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    static void task2(int i1, int i2, int i3, int i4) {
        int nod = nod(i1, nod(i2, nod(i3, i4)));
        System.out.printf("НОД для чисел %d %d %d %d равно %d\n", i1, i2, i3, i4, nod);
    }

    private static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }
}
