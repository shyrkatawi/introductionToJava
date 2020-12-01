package unit1.cycles;

import java.math.BigInteger;

/**
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
class Task4 {
    public static void main(String[] args) {
        BigInteger result = task4();
        System.out.println(result);
    }

    static BigInteger task4() {
        BigInteger bigInt = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i++) {
            bigInt = bigInt.multiply(BigInteger.valueOf(i * i));
        }
        return bigInt;
    }

//    static void task4() {
//        System.out.println(IntStream.range(1, 201)
//                .mapToObj(BigInteger::valueOf)
//                .map(i -> i.pow(2))
//                .reduce(BigInteger::multiply).get());
//    }
}
