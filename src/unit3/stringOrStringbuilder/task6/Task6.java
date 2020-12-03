package unit3.stringOrStringbuilder.task6;

/**
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
class Task6 {
    static String addAfterEveryCharCopyOfChar(String str) {
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() * 2);
        for (char c : str.toCharArray()) {
            sb.append(c);
            sb.append(c);
        }
        return sb.toString();
    }
}
