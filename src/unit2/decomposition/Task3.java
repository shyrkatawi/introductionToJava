package unit2.decomposition;

public class Task3 {
    //3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
    static void task3(int side) {
        double area = areaOfRegularHexagon(side);
        System.out.printf("Площадь правильного шестиугольника со стороной %d равна %.3f\n", side,area);
    }

    private static double areaOfRegularHexagon(int side) {
        return ((3 * Math.sqrt(3)) / 2) * side * side;
    }
}
