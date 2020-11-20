package unit3.stringAsArrayOfChars;

import unit3.MethodsUnit3;

/**
 * 3. В строке найти количество цифр.
 */
public class Task3 {
    static int getNumberOfDigitsInString(String str) {
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
