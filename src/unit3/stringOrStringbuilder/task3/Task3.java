package unit3.stringOrStringbuilder.task3;

import unit3.MethodsUnit3;

/**
 * 3. Проверить, является ли заданное слово палиндромом. *
 */
class Task3 {
    /**
     * works only with ASCII Table
     */
    static boolean isPalindrome(String str) {
        if (str.length() < 2) {
            return false;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            char c1 = MethodsUnit3.toLowerCase(str.charAt(i));
            char c2 = MethodsUnit3.toLowerCase(str.charAt(str.length() - i - 1));
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}
