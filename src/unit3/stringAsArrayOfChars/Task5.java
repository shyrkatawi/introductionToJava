package unit3.stringAsArrayOfChars;

import java.util.Arrays;

/**
 * 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */
public class Task5 {
    public static void main(String[] args) {
    }

    static String removeExtraSpacesInString(String str) {
        char[] tmpArray = new char[str.length()];
        char space = 32;
        boolean isSpace = true;
        int tmpIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == space) {
                if (!isSpace) {
                    isSpace = true;
                    tmpArray[tmpIndex] = c;
                    tmpIndex++;
                }
            } else {
                isSpace = false;
                tmpArray[tmpIndex] = c;
                tmpIndex++;
            }
        }

//        delete the last space if it exists
        if (tmpIndex > 0) {
            if (tmpArray[tmpIndex - 1] == space) {
                tmpIndex--;
            }
        }
        return String.valueOf(Arrays.copyOf(tmpArray, tmpIndex));
    }
}
