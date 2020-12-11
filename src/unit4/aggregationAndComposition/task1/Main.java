package unit4.aggregationAndComposition.task1;

class Main {
    public static void main(String[] args) {
        Sentence sentence1 = new Sentence();
        sentence1.addInSentence("da");
        sentence1.addInSentence("net");
        sentence1.addInSentence("y");

        Sentence sentence2 = new Sentence();
        sentence2.addInSentence("2da");
        sentence2.addInSentence("2net");
        sentence2.addInSentence("2y");

        Text text = new Text("First text");
        text.addInText(sentence1);
        text.addInText(sentence2);

        text.printTitle();
        text.printText();

        System.out.println();
    }
}