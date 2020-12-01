package unit2.decomposition.task6;

/**
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 * Взаимно простые числа — целые числа, не имеющие никаких общих делителей, кроме ±1.
 * Равносильное определение: целые числа взаимно просты, если их наибольший общий делитель (НОД) равен 1.
 */
class Task6 {
    public static void main(String[] args) {
        int i1 = 15;
        int i2 = 15;
        int i3 = 45;
        boolean mutuallyPrime = areNumbersMutuallyPrime(i1, i2, i3);
        String word;
        if (mutuallyPrime) {
            word = "";
        } else {
            word = "not";
        }
        System.out.printf("Numbers %d %d %d are %s mutually prime\n", i1, i2, i3,word);
    }

    static boolean areNumbersMutuallyPrime(int i1, int i2, int i3) {
        return nod(i1, nod(i2, i3)) == 1;
    }

    static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }
}
