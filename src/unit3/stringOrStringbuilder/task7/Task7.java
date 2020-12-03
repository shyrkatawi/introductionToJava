package unit3.stringOrStringbuilder.task7;

import java.util.Arrays;

/**
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */
class Task7 {
    static String deleteDuplicatesAndAllSpaces(String str) {
        if (str.length() == 0) {
            return str;
        }
        char space = 32;
        boolean[] isDuplicate = new boolean[128];
        char[] array = new char[str.length()];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != space && !isDuplicate[c]) {
                isDuplicate[c] = true;
                array[index]=c;
                index++;
            }
        }
        return String.valueOf(Arrays.copyOf(array, index));
    }
}
