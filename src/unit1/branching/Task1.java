package unit1.branching;

/**
 * 1. Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */
class Task1 {
    public static void main(String[] args) {
        int angle1 = 80;
        int angle2 = 90;
        boolean result = isTriangleExist(angle1, angle2);
        if (result) {
            System.out.println("The triangle exists");
            if (isTriangleIsRectangular(angle1, angle2)) {
                System.out.println("The triangle is rectangular.");
            } else {
                System.out.println("The triangle is not rectangular.");
            }
        } else {
            System.out.println("The triangle does not exist");
        }
    }

    static boolean isTriangleExist(int angle1, int angle2) {
        return (angle1 + angle2) < 180;
    }

    static boolean isTriangleIsRectangular(int angle1, int angle2) {
        return angle1 == 90 || angle2 == 90 || (angle1 + angle2 == 90);
    }
}
