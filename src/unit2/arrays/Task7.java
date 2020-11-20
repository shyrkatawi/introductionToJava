package unit2.arrays;

/**
 * 7. Даны действительные числа a1, a2, ..., a(n), ..., a(2n).
 * Найти max(a1 + a(n), a2 + a(n-1), a3 + a(n-2) и т.д.)
 */
public class Task7 {
    public static void main(String[] args) {

    }
    static void task7(int[] array) {
        Main.showArray(array);
        int[] arrayOfSum = new int[array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            arrayOfSum[i] = array[i] + array[array.length - i - 1];
        }
        Main.showArray(arrayOfSum);
        int max = arrayOfSum[0];
        for (int i = 1; i < arrayOfSum.length; i++) {
            if (arrayOfSum[i] > max) {
                max = arrayOfSum[i];
            }
        }
        System.out.println(max);
    }
}
