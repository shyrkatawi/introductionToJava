package unit2.multiArrays;

public class Task16 {
    //16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n^2. Построить магический квадрат размером n*n.
    static void task16(int size) {
        int[][] arr = new int[size][size];
        int sum = 0;
        int sum1 = 0;
        int sumD1 = 0;
        int sumD2 = 0;
        boolean res = true;


        for (int i = arr.length - 1; i >= 0; i--){
            sumD1 += arr[i][i];
        }

        for (int i = 0; i < arr.length; i++){
            sumD2 += arr[i][i];
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
                sum1 += arr[j][i];
            }

            if (sumD1 != sum || sumD1 != sum1) {
                res = false;
                break;
            }
            sum = 0;
            sum1 = 0;
        }

        if (sumD1 != sumD2) {
            res = false;
        }
        Main.showMatrix(arr);
        System.out.println();
        System.out.println(27 + 35 + 1 + 9 + 17 + 19);
        System.out.println(20 +28+ 36+ 2+ 10+ 18 );
        System.out.println(20 +21+ 22+ 23+ 24+ 19 );
    }
}