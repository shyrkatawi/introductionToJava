package unit3.stringOrStringbuilder;

import unit3.MethodsUnit3;

/**
 * 3. Проверить, является ли заданное слово палиндромом. *
 */
public class Task3 {
    static boolean isPalindrome(String str) {
        if (str.length() < 2) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < str.length() / 2; i++) {
            char c1 = MethodsUnit3.toLowerCase(str.charAt(i));
            char c2 = MethodsUnit3.toLowerCase(str.charAt(str.length() - i - 1));
            result = c1 == c2;
        }
        return result;
    }
}
