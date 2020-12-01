package unit2.decomposition.task2;

/**
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
class Task2 {
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 8;
        int i3 = 6;
        int i4 = 2;
        int nod = task2(i1, i2, i3, i4);
        System.out.printf("НОД %d %d %d %d = %d\n", i1, i2, i3, i4, nod);
    }

    static int task2(int i1, int i2, int i3, int i4) {
        return nod(i1, nod(i2, nod(i3, i4)));
    }

    static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }
}
