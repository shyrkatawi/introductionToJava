package unit3.stringAsArrayOfChars;

import unit3.MethodsUnit3;

/**
 * 4. В строке найти количество чисел.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][];
        matrix[0] = new int[]{1};
        matrix[1] = new int[]{2, 2};
        matrix[2] = new int[]{3, 3, 3};
        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static int genNumberOfNumbersInString(String str) {
        int result = 0;
        boolean isNumber = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (MethodsUnit3.isDigit(c)) {
                if (!isNumber) {
                    isNumber = true;
                    result++;
                }
            } else {
                isNumber = false;
            }
        }
        return result;
    }
}
