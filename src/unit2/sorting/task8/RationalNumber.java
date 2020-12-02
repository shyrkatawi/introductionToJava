package unit2.sorting.task8;

class RationalNumber {
    int numerator;
    int denominator;

    RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }

    void recalculate(int newDenominator) {
        this.numerator = this.numerator * (newDenominator / denominator);
        this.denominator = newDenominator;
    }

    @Override
    public String toString() {
        return String.format("[%d/%d]", numerator, denominator);
    }
}
