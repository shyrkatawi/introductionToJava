package unit2.arrays;

/**
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task1 {
    public static void main(String[] args) {
        int result = task1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2);
        System.out.println(result);

    }

    static int task1(int[] array, int k) {
        int sum = 0;
        for (int i : array) {
            if (i % k == 0) {
                sum += i;
            }
        }
        return sum;
    }

//    static void task1(int[] array, int k) {
//        System.out.println(Arrays.stream(array).filter(i -> i % k == 0).reduce(Integer::sum).orElse(0));
//    }
}
