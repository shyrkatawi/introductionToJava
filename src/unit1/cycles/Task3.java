package unit1.cycles;

/**
 * 3. Найти сумму квадратов первых ста чисел.
 */
public class Task3 {
    public static void main(String[] args) {
        int result = task3();
        System.out.println(result);
    }

    static int task3() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i * i;
        }
        return sum;
    }

//    static void task3() {
//        System.out.println(IntStream.range(1, 101).map(i -> i * i).reduce(Integer::sum).orElse(0));
//    }
}
