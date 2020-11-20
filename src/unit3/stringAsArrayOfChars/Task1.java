package unit3.stringAsArrayOfChars;


import unit3.MethodsUnit3;

import java.util.Arrays;


/**
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Task1 {
    static String[] task1(String[] array) {
        String[] resultArray = new String[array.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = fromCamelToSnakeCase(array[i]);
        }
        return resultArray;
    }

    static String fromCamelToSnakeCase(String str) {
        String resultStr;
        if (str.length() == 0 || str.length() == 1) {
            resultStr = str;
        } else {
            char[] tmpArray = new char[str.length() * 2];
            int position = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (MethodsUnit3.isUpperCase(c)) {
                    tmpArray[position] = '_';
                    position++;
                    tmpArray[position] = MethodsUnit3.toLowerCase(c);
                } else {
                    tmpArray[position] = c;
                }
                position++;
            }
            resultStr = String.valueOf(Arrays.copyOf(tmpArray, position));
        }
        return resultStr;
    }
}
