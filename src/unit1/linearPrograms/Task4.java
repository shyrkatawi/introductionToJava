package unit1.linearPrograms;

/**
 * 4. Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
public class Task4 {
    public static void main(String[] args) {
        double result = task4(123.456);
        System.out.println(result);
    }

    static double task4(double r) {
        double beforeDot = (int) r * 0.001;
        int afterDot = (int) (r % 1 * 1000);
        return afterDot + beforeDot;
    }
}
