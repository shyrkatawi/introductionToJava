package unit4.aggregationAndComposition.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

class Sentence {
    private List<Word> sentence = new ArrayList<>();

    Sentence() {
    }

    void addInSentence(String s) {
        sentence.add(new Word(s));
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(" ");
        for (Word word : sentence) {
            sj.add(word.getValue());
        }
        return sj.toString();
    }
}
