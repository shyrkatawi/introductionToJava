package unit3.da;

/**
 * 1. Создать приложение, разбирающее текст (текст хранится в строке)
 * и позволяющее выполнять с текстом три различных операции:
 * отсортировать абзацы по количеству предложений;
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 */
public class Task1 {
    static String sortParagraphsByNumberOfSentences(String str) {
        if (str.length() < 2) {
            return str;
        }
        return null;
    }

    static String sortWordsByLengthInEachSentence(String str){
        if (str.length() < 2) {
            return str;
        }
        return null;
    }
}
