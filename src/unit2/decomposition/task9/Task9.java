package unit2.decomposition.task9;

/**
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */
class Task9 {
    public static void main(String[] args) {
        double result = task9(3, 4, 5, 6);
        System.out.println(result);
    }

    /**
     * returns double in format d.dd;
     */
    static double task9(int x, int y, int z, int t) {
        double p = (x + y + z + t) / 2.0;
        double s = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
        return (int) (s * 100 + 0.5) / 100.0;
    }
}
