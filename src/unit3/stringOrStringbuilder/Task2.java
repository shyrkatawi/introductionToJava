package unit3.stringOrStringbuilder;

import java.util.Arrays;

/**
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task2 {
    static String addAfterEveryChar_a_Char_b(String str) {
        if (str.length() == 0) {
            return str;
        }
        char[] array = new char[str.length() * 2];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            array[index] = str.charAt(i);
            index++;
            if (str.charAt(i) == 'a') {
                array[index] = 'b';
                index++;
            }
        }
        return String.valueOf(Arrays.copyOf(array, index));
    }
}
