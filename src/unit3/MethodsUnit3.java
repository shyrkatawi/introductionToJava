package unit3;

public class MethodsUnit3 {
    public static boolean isDigit(char c) {
        return c >= 48 && c <= 57;
    }

    public static boolean isUpperCase(char c) {
        return c >= 65 && c <= 90;
    }

    public static boolean isLowerCase(char c) {
        return c >= 97 && c <= 122;
    }

    public static char toUpperCase(char c) {
        if (isLowerCase(c)) {
            c -= 32;
        }
        return c;
    }

    public static char toLowerCase(char c) {
        if (isUpperCase(c)) {
            c += 32;
        }
        return c;
    }

    public static char[] toCharArray(String str) {
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
        }
        return array;
    }
}
