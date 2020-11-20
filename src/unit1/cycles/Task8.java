package unit1.cycles;

/**
 * 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task8 {
    public static void main(String[] args) {
        task8();
    }

    private static void task8() {
        boolean[] resultArray = getDigitsIncludedOfEachNumber(123477, 2346670);
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i]) {
                System.out.println(i);
            }
        }
    }

    static boolean[] getDigitsIncludedOfEachNumber(int number1, int number2) {
        boolean[] ifInclude = new boolean[10];
        while (number1 > 0) {
            int digit = number1 % 10;
            int temp = number2;
            while (temp > 0) {
                if (temp % 10 == digit) {
                    ifInclude[digit] = true;
                    break;
                }
                temp /= 10;
            }
            number1 /= 10;
        }
        return ifInclude;
    }

//    static void task8(int a, int b) {
//        Set<String> set = new HashSet<>();
//        for (String s1 : String.valueOf(a).split("")) {
//            for (String s2 : String.valueOf(b).split("")) {
//                if (s1.equals(s2)) {
//                    set.add(s1);
//                    break;
//                }
//            }
//        }
//        System.out.println(set);
//    }
}
