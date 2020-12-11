package unit4.classesAndObjects.task5;

class Counter {
    private int minValue;
    private int currentValue;
    private int maxValue;

    Counter() {
        this.minValue = 0;
        this.currentValue = 0;
        this.maxValue = 10;
    }

    Counter(int minValue, int currentValue, int maxValue) {
        this.minValue = minValue;
        this.currentValue = currentValue;
        this.maxValue = maxValue;
    }

    int getCurrentValue() {
        return currentValue;
    }

    void increaseValue() {
        if (currentValue >= maxValue) {
            System.out.printf("You can't increase this value because" +
                    " the max value is %d and the current value is %d\n", this.maxValue, this.currentValue);
        } else {
            currentValue++;
        }
    }

    void decreaseValue() {
        if (currentValue <= minValue) {
            System.out.printf("You can't decrease this value because" +
                    " the min value is %d and the current value is %d\n", this.minValue, this.currentValue);
        } else {
            currentValue--;
        }
    }

    @Override
    public String toString() {
        return "Counter{" +
                "minValue=" + minValue +
                ", currentValue=" + currentValue +
                ", maxValue=" + maxValue +
                '}';
    }
}
