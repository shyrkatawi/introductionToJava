package unit2.decomposition;

public class Task4 {
    //4. На плоскости заданы своими координатами n точек.
    //Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
    //Указание. Координаты точек занести в массив.
    static void task4(int[][] points) {
        if (points.length == 2 && points[0].length == points[1].length) {
            Main.showMatrix(points, "Исходные пары");
            int maxDistance = getMaxDistanceBetweenPoints(points);
            System.out.printf("Максимальная дистанция между точками: %d\n", maxDistance);
            showPointsWithMaxDistance(points, maxDistance);
        } else {
            System.out.println("Неверные входные данные.");
        }
    }

    private static int getMaxDistanceBetweenPoints(int[][] points) {
        int maxDistance = 0;
        for (int i = 0; i < points[0].length; i++) {
            int currentDistance = Math.abs(points[0][i] - points[1][i]);
            if (currentDistance > maxDistance) {
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    private static void showPointsWithMaxDistance(int[][] points, int maxDistance) {
        for (int i = 0; i < points[0].length; i++) {
            if (Math.abs(points[0][i] - points[1][i]) == maxDistance) {
                System.out.printf("Пара с максимальной дистанцией между точками: %d %d\n", points[0][i], points[1][i]);
            }
        }
    }
}
