package unit2.decomposition.task3;

/**
 * 3. Вычислить площадь правильного шестиугольника со стороной а,
 * используя метод вычисления площади треугольника.
 */
class Task3 {
    public static void main(String[] args) {
        int side = 2;
        double area = areaOfRegularHexagon(side);
        System.out.printf("The area of a regular hexagon with side %d is %.3f\n", side, area);
    }

    /**
     * returns double in format d.ddd;
     */
    static double areaOfRegularHexagon(int side) throws IllegalArgumentException {
        if (side <= 0) {
            throw new IllegalArgumentException("side must be more that 0");
        }
        double result = ((3 * Math.sqrt(3)) / 2) * side * side;
        return (int) (result * 1000 + 0.5) / 1000.0;
    }
}
