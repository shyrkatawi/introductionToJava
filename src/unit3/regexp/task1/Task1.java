package unit3.regexp.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.regex.Pattern;

/**
 * 1. Создать приложение, разбирающее текст (текст хранится в строке)
 * и позволяющее выполнять с текстом три различных операции:
 * отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 */
public class Task1 {
    public static void main(String[] args) {
        String text = "Первый абзац. Три предложения. Три!\n" +
                "Второй абзац. Пять предложений. Это третье предложение. Это четвертое. И это пятое...\n" +
                "Третий абзац и всего одно предложение.\n" +
                "Четвертый абзац и семь предложений. Второе. Третье. Четвертое. Пятое. Шестое? Седьмое.\n" +
                "Пятый абзац и снова одно предложение.\n" +
                "Шестой абзац. Привет.";
        String sorted1 = sortParagraphsByNumberOfSentences(text);
        System.out.println(sorted1);

        String sorted2 = sortWordsByLengthInEachSentence(text);
        System.out.println(sorted2);
    }

    /**
     * sort in ascending order
     */
    static String sortParagraphsByNumberOfSentences(String str) {
        String[] paragraphs = splitToParagraphs(str);
        Arrays.sort(paragraphs, Comparator.comparing(Task1::getCountOfSentences));
        return createTextFromParagraphs(paragraphs);
    }

    /**
     * sort in ascending order
     */
    static String sortWordsByLengthInEachSentence(String str) {
        String[] paragraphs = splitToParagraphs(str);
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitToSentences(paragraphs[i]);
            StringJoiner joiner = new StringJoiner(" ");
            for (String s : sentences) {
                joiner.add(sortWordsByLength(s));
            }
            paragraphs[i] = joiner.toString();
        }
        return createTextFromParagraphs(paragraphs);
    }

    static String[] splitToParagraphs(String str) {
        return str.split("\n");
    }

    static String[] splitToSentences(String text) {
        return Pattern.compile("\\.*[.!?]\\s*").split(text);
    }

    static String[] splitToWords(String str) {
        return Pattern.compile("\\s*(\\s|,|;|:)\\s*").split(str);
    }

    static String sortWordsByLength(String str) {
        String[] words = splitToWords(str);
        Arrays.sort(words, Comparator.comparing(String::length));
        StringJoiner joiner = new StringJoiner(" ");
        for (String w : words) {
            joiner.add(w);
        }
        return joiner.toString();
    }

    static String createTextFromParagraphs(String[] paragraphs) {
        StringJoiner joiner = new StringJoiner("\n");
        for (String p : paragraphs) {
            joiner.add(p);
        }
        return joiner.toString();
    }

    static int getCountOfSentences(String str) {
        int count = 0;
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
