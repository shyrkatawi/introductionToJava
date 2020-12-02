package unit2.sorting.task8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 8. Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные).
 * Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */
class Task8 {
    public static void main(String[] args) {
        RationalNumber[] numbers = new RationalNumber[5];
        numbers[0] = new RationalNumber(1, 4);
        numbers[1] = new RationalNumber(1, 6);
        numbers[2] = new RationalNumber(1, 5);
        numbers[3] = new RationalNumber(1, 2);
        numbers[4] = new RationalNumber(1, 3);

        System.out.println(Arrays.toString(numbers));

        int nok = numbers[0].getDenominator();
        for (int i = 1; i < numbers.length; i++) {
            nok = nok(nok, numbers[i].getDenominator());
        }

        for (RationalNumber number : numbers) {
            number.recalculate(nok);
        }

        Arrays.sort(numbers, Comparator.comparingInt(RationalNumber::getNumerator));
        System.out.println(Arrays.toString(numbers));
    }


    static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }
}
