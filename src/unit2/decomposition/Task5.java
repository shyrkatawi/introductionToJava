package unit2.decomposition;

public class Task5 {
    //5. Составить программу, которая в массиве A[N] находит второе по величине число
    //(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
    static void task5(int[] array) {
        Main.showIntArray(array,"Исходный массив");
        int max;
        int secondMax;
        if (array[0] > array[1]) {
            max = array[0];
            secondMax = array[1];
        } else {
            max = array[1];
            secondMax = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            int element = array[i];
            if (element>secondMax){
                secondMax=element;
                if(element>max){
                    int tmp = max;
                    max=element;
                    secondMax=tmp;
                }
            }
        }
        System.out.printf("Максимальное число %d, второе по величине число %d\n",max,secondMax);
    }
}
