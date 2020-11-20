package unit3;

public class MethodsOfUnit3 {
    public static char[] toCharArray(String s) {
        //Создаю массив длинной исходной строки.
        char[] array = new char[s.length()];

        //Копирую каждый символ строки в массив.
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
        }
        return array;
    }

    public static char toUpperCase(char c) {
        return toUpperCase((int) c);
    }
    public static char toLowerCase(char c) {
        return toLowerCase((int) c);
    }

    public static char toUpperCase(int decimalValue) {
        if (decimalValue >= 97 && decimalValue <= 122) {
           decimalValue-=32;
        }
        return (char) decimalValue;
    }

    public static char toLowerCase(int decimalValue) {
        if (decimalValue >= 65 && decimalValue <= 90) {
           decimalValue+=32;
        }
        return (char) decimalValue;
    }
}
