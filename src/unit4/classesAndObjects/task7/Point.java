package unit4.classesAndObjects.task7;

class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point: " +
                "x=" + x +
                " y=" + y;
    }
}
