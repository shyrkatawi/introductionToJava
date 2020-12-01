package unit2.decomposition.task4;

import unit2.MethodsUnit2;

/**
 * 4. На плоскости заданы своими координатами n точек.
 * Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив.
 */
class Task4 {
    public static void main(String[] args) {
        int[][] points = new int[][]{{3, 1}, {1, -2}, {4, 5}, {-1, -5}};
        if (points.length == 2 && points[0].length == points[1].length) {
            MethodsUnit2.printMatrix(points, "Исходные пары");
            int maxDistance = getMaxDistanceBetweenPoints(points);
            System.out.printf("Максимальная дистанция между точками: %d\n", maxDistance);
            showPointsWithMaxDistance(points, maxDistance);
        } else {
            System.out.println("Неверные входные данные.");
        }
    }

    static int getMaxDistanceBetweenPoints(int[][] points) {
        int maxDistance = 0;
        for (int[] array : points) {
            int currentDistance = Math.abs(array[0] - array[1]);
            if (currentDistance > maxDistance) {
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    static void showPointsWithMaxDistance(int[][] points, int maxDistance) {
        for (int[] array : points) {
            int currentDistance = Math.abs(array[0] - array[1]);
            if (currentDistance == maxDistance) {
                System.out.printf("Pair with the maximum distance between points: %d %d\n", array[0], array[1]);
            }
        }
    }
}
