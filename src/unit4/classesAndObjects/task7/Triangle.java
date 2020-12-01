package unit4.classesAndObjects.task7;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.sideA = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
        this.sideB = Math.sqrt(Math.pow((b.getX() - c.getX()), 2) + Math.pow((b.getY() - c.getY()), 2));
        this.sideC = Math.sqrt(Math.pow((c.getX() - a.getX()), 2) + Math.pow((c.getY() - a.getY()), 2));
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        return Math.sqrt((getPerimeter() / 2)
                * ((getPerimeter() / 2) - sideA)
                * ((getPerimeter() / 2) - sideB)
                * ((getPerimeter() / 2) - sideC));
    }

    public Point getMedian() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x, y);
    }
}