package unit3.stringAsArrayOfChars.task4;

import unit3.MethodsUnit3;

/**
 * 4. В строке найти количество чисел.
 */
class Task4 {
    static int genNumberOfNumbersInString(String str) {
        if (str.length() == 0) {
            return 0;
        }
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
