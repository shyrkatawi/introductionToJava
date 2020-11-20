package unit1.cycles;

/**
 * 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Task6 {
    public static void main(String[] args) {
        task6();
    }

    static void task6() {
        for (int i = 0; i <= 255; i++) {
            System.out.printf("%d = %s\n", i, getCharByNumericValue(i));
        }
    }

    static char getCharByNumericValue(int value) {
        return (char) value;
    }
}
