package unit3.da;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;

/**
 * 1. Создать приложение, разбирающее текст (текст хранится в строке)
 * и позволяющее выполнять с текстом три различных операции:
 * отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 */
public class Task1 {
    /**
     * sort in ascending order
     */
    static String sortParagraphsByNumberOfSentences(String str) {
        if (str.length() < 2) {
            return str;
        }
        String[] paragraphs = splitStringToParagraphs(str);
        if (paragraphs.length < 2) {
            return str;
        }
        Arrays.sort(paragraphs, Comparator.comparing(Task1::getCountOfSentences));
        return createTextFromParagraphs(paragraphs);
    }

    /**
     * sort in ascending order
     */
    static String sortWordsByLengthInEachSentence(String str) {
        if (str.length() < 2) {
            return str;
        }
        String[] paragraphs = splitStringToParagraphs(str);
        for (int i = 0; i < paragraphs.length; i++) {

        }
        return null;
    }

    static String sortWordsByLength(String str) {
        String[] words = str.split("\\s+");
        Arrays.sort(words, Comparator.comparing(Task1::calculateWordLength));
        StringJoiner joiner = new StringJoiner(" ");
        for (String w : words) {
            joiner.add(w);
        }
        return joiner.toString();
    }

    static String[] splitStringToParagraphs(String str) {
        return str.split("\n");
    }

    static String createTextFromParagraphs(String[] paragraphs) {
        StringJoiner joiner = new StringJoiner("\n");
        for (String p : paragraphs) {
            joiner.add(p);
        }
        return joiner.toString();
    }

    static int getCountOfSentences(String str) {
        if (str.length() == 0) {
            return 0;
        }
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


    static int calculateWordLength(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c)) {
                length++;
            }

        }
        return length;
    }
}
