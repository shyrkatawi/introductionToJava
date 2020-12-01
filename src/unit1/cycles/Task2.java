package unit1.cycles;

/**
 * 2. Вычислить значения функции на отрезке [а,b] c шагом h:
 * if x>2 then y = x,
 * else y = -x,
 */
class Task2 {
    public static void main(String[] args) {
        int[][] result = task2(1, 9, 8);
        for (int[] array : result) {
            System.out.printf("x = %d, y = %d\n", array[0], array[1]);
        }
    }

    /**
     * The result of calculations is represented as "array of arrays".
     * The coordinate X is stored in the first element of the internal array (array[i][0]),
     * the coordinate Y is stored in the second element of the internal array(array[i][1]).
     */
    static int[][] task2(int a, int b, int h) {
        int arrayLength = ((b - a) / h) + 1;
        int[][] resultArray = new int[arrayLength][2];
        int position = 0;
        for (int x = a; x <= b; x += h) {
            resultArray[position][0] = x;
            resultArray[position][1] = calculateValueOfY(x);
            position++;
        }
        return resultArray;
    }

    private static int calculateValueOfY(int x) {
        return (x > 2) ? x : -x;
    }
}
