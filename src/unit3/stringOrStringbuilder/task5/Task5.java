package unit3.stringOrStringbuilder.task5;

/**
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
class Task5 {
    static int getNumberOfCharSelectedChar(char c, String str) {
        if (str.length() == 0) {
            return 0;
        }
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                number++;
            }
        }
        return number;
    }
}
