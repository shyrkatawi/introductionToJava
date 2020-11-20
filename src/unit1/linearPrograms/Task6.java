package unit1.linearPrograms;

/**
 * 6. Для данной области составить линейную программу, которая печатает
 * true, если точка с координатами (х, у) принадлежит закрашенной области,
 * false — в противном случае.
 */
public class Task6 {
    public static void main(String[] args) {
        boolean result = task6(4, -3);
        System.out.println(result);
    }

    static boolean task6(int x, int y) {
        boolean condition1 = isLocated(x, -4, 4) && isLocated(y, -3, 0);
        boolean condition2 = isLocated(x, -2, 2) && isLocated(y, 0, 4);
        return condition1 || condition2;
    }

    static boolean isLocated(int position, int point1, int point2) {
        return position >= point1 && position <= point2;
    }
}
