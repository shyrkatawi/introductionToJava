package unit4.aggregationAndComposition.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создать объект класса Текст, используя классы: Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
class Text {
    private String title;
    private List<Sentence> text = new ArrayList<>();

    public Text(String title) {
        this.title = title;
    }

    void addInText(Sentence sentence) {
        text.add(sentence);
    }

    void printText() {
        for (Sentence sentence : text) {
            System.out.println(sentence);
        }
    }

    void printTitle() {
        System.out.println("Title: " + title);
    }
}