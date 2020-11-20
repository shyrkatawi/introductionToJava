package unit1.branching;


/**
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 * Определить, будут ли они расположены на одной прямой.
 */
public class Task3 {
    public static void main(String[] args) {
        boolean result = task3(1, 2, 3, 4, 5, 6);
        if (result) {
            System.out.println("The points are located on the same straight line.");
        } else {
            System.out.println("The points are not located on the same straight line.");
        }
    }

    static boolean task3(int x1, int y1, int x2, int y2, int x3, int y3) {
        return ((x3 - x1) * (y2 - y1)) == ((x2 - x1) * (y3 - y1));
    }
}
