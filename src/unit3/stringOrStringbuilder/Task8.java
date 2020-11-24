package unit3.stringOrStringbuilder;

/**
 * 8. Вводится строка слов, разделенных пробелами.
 * Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */
public class Task8 {
    /**
     * If there are several words with the maximum length, returns the first one
     */
    static String getLongestWord(String str) {
        if (str.length() == 0) {
            return str;
        }
        String longestWord = "";
        for (String word : str.split("( )+")) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
