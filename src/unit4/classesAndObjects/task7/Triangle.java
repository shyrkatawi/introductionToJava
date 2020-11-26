package unit4.classesAndObjects.task7;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        if (a + b > c || a + c > b || b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("Incorrect data(a, b, c.). The triangle is not exist.");
        }
    }

    public int calculatePerimeter() {
        return a + b + c;
    }

    public double calculateArea() {
        double p = (a + b + c) >> 1;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double calculateMedian() {
        return 0.5 * Math.sqrt((2 * b * b) + (2 * c * c) - (a * 2));
}
}