package unit3.stringAsArrayOfChars;

import java.util.Arrays;

/**
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task2 {
    static String task2(String str) {
        String result;
        if (str.length() < 4) {
            result = str;
        } else {
            char[] array = new char[str.length() * 2];
            int index = 0;
            for (int i = 0; i < str.length(); i++) {
                if ((i <= str.length() - 4) &&
                        (str.charAt(i) == 'w') &&
                        (str.charAt(i + 1) == 'o') &&
                        (str.charAt(i + 2) == 'r') &&
                        (str.charAt(i + 3) == 'd')) {
                    array[index] = 'l';
                    array[index + 1] = 'e';
                    array[index + 2] = 't';
                    array[index + 3] = 't';
                    array[index + 4] = 'e';
                    array[index + 5] = 'r';
                    i += 3;
                    index += 6;
                } else {
                    array[index] = str.charAt(i);
                    index++;
                }
            }
            result = String.valueOf(Arrays.copyOf(array, index));
        }
        return result;
    }
}
