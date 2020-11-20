package unit3.stringOrStringbuilder;

import unit3.MethodsUnit3;

/**
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class Task5 {
    static int getNumberOfCharSelectedChar(char c, String str) {
        int number = 0;
        char[] chars = MethodsUnit3.toCharArray(str);
        for (char charFromStr : chars) {
            if (c == charFromStr) {
                number++;
            }
        }
        return number;
    }
}
