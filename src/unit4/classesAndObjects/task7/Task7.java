package unit4.classesAndObjects.task7;

/**
 * 7. Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */
public class Task7 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(3, 2);
        Triangle triangle = new Triangle(p1, p2, p3);
        System.out.println("perimeter " + triangle.getPerimeter());
        System.out.println("area " + triangle.getArea());
        System.out.println("median " + triangle.getMedian());
    }
}