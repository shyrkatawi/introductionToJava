package unit3.stringAsArrayOfChars;

import java.util.Arrays;

/**
 * 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */
public class Task5 {
    static String removeExtraSpacesInString(String str) {
        char[] array = new char[str.length()];
        char space = 32;
        boolean isSpace = true;
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == space) {
                if (!isSpace) {
                    isSpace = true;
                    array[index] = c;
                    index++;
                }
            } else {
                isSpace = false;
                array[index] = c;
                index++;
            }
        }

//        delete the last space if it exists
        if (index > 0) {
            if (array[index - 1] == space) {
                index--;
            }
        }
        return String.valueOf(Arrays.copyOf(array, index));
    }
}
