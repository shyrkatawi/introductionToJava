package unit3.stringAsArrayOfChars;

import java.util.Arrays;

/**
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task2 {
    static String stringReplace(String source, String oldStr, String newStr) {
        if (source.length() == 0) {
            return source;
        }
        char[] array = new char[source.length() * newStr.length()];
        int index = 0;
        for (int i = 0; i < source.length(); ) {
            if ((source.charAt(i) == oldStr.charAt(0)) && (i <= source.length() - oldStr.length())) {
                boolean replace = false;
                for (int k = 0; k < oldStr.length(); k++) {
                    replace = source.charAt(i + k) == oldStr.charAt(k);
                }
                if (replace) {
                    for (int k = 0; k < newStr.length(); k++) {
                        array[index + k] = newStr.charAt(k);
                    }
                    i += oldStr.length();
                    index += newStr.length();
                }
            } else {
                array[index] = source.charAt(i);
                index++;
                i++;
            }
        }
        return String.valueOf(Arrays.copyOf(array, index));
    }
}
