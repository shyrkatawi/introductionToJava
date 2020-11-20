package unit1.linearPrograms;

/**
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 * ((sinX+cosY) / (cosX-sinY)) * tgXY
 */
public class Task3 {
    public static void main(String[] args) {
        double result = task3(3, 4);
        System.out.println(result);
    }

    static double task3(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.cos(y))) * Math.tan(x * y);
    }
}
