package unit3.stringOrStringbuilder;

/**
 * 10. Строка X состоит из нескольких предложений,
 * каждое из которых кончается точкой, восклицательным или вопросительным знаком.
 * Определить количество предложений в строке X.
 */
public class Task10 {
    static int getCountOfSentences(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int count = 0;
        str = str.replaceAll("[,]+","");
        String[] sentences = str.split("[.!?]+");
        for (String s : sentences) {
            s = s.trim();
            if (s.length() != 0) {
                count++;
            }
        }
        return count;
    }
}
