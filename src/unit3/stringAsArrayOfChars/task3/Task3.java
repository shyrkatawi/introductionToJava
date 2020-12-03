package unit3.stringAsArrayOfChars.task3;

import unit3.MethodsUnit3;

/**
 * 3. В строке найти количество цифр.
 */
class Task3 {
    static int getNumberOfDigitsInString(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int number = 0;
        char[] chars = MethodsUnit3.toCharArray(str);
        for (char c : chars) {
            if (MethodsUnit3.isDigit(c)) {
                number++;
            }
        }
        return number;
    }
}
