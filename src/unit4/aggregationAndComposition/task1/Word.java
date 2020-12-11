package unit4.aggregationAndComposition.task1;

class Word {
    String value;

    Word(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}