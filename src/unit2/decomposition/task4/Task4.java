package unit2.decomposition.task4;

/**
 * 4. На плоскости заданы своими координатами n точек.
 * Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив.
 */
class Task4 {
    public static void main(String[] args) {
        int[][] points = new int[][]{{3, 1}, {1, -2}, {4, 5}, {-1, -5}};
        showPointsWithMaxDistance(points);
    }

    static void showPointsWithMaxDistance(int[][] points) {
        int maxDistance = findMaxDistanceBetweenPoints(points);
        for (int[] array : points) {
            int currentDistance = Math.abs(array[0] - array[1]);
            if (currentDistance == maxDistance) {
                System.out.printf("Pair with the maximum distance between points: %d %d\n", array[0], array[1]);
            }
        }
    }

    static int findMaxDistanceBetweenPoints(int[][] points) {
        int maxDistance = 0;
        for (int[] array : points) {
            int currentDistance = Math.abs(array[0] - array[1]);
            if (currentDistance > maxDistance) {
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }
}
