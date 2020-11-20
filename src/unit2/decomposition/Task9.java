package unit2.decomposition;

public class Task9 {
    //9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
    static void task9(int x, int y, int z, int t) {
        double p = (x + y + z + t) / 2.0;
        double s = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
        System.out.printf("Площадь четырёх угольника со сторонами %d %d %d %d равна %.3f\n", x, y, z, t, s);
    }
}
