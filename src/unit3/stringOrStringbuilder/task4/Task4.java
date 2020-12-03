package unit3.stringOrStringbuilder.task4;

/**
 * 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
class Task4 {
    static String task4(String str) {
        String result = String.valueOf(str.charAt(7));
        result += String.valueOf(str.charAt(3));
        result += String.valueOf(str.charAt(4));
        result += String.valueOf(str.charAt(7));
        return result;
    }
}
