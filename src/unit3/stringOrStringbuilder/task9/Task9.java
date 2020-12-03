package unit3.stringOrStringbuilder.task9;

import unit3.MethodsUnit3;

/**
 * 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
 * Учитывать только английские буквы.
 */
class Task9 {
    /**
     * returns:
     * int[0] = number of lower_case letters,
     * int[1] = number of upper_case letters
     */
    static int[] getNumberOfLowerAndUppercaseLetters(String str) {
        if (str.length() == 0) {
            return new int[2];
        }
        int[] result = new int[2];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (MethodsUnit3.isLowerCase(c)) {
                result[0] += 1;
            } else if (MethodsUnit3.isUpperCase(c)) {
                result[1] += 1;
            }
        }
        return result;
    }
}
