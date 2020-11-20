package unit2.sorting;

public class Main {
    public static void main(String[] args) {
//        Task1.task1(new int[]{1,2,3,4,5,6,7,8}, new int[]{66,7,8,99},3);
//        Task2.task2(new int[]{1,3,4,5,7,8}, new int[]{1,2,6,7,99});
//        Task3.task3(new int[]{4,5,6,78,11,1,2,6,7,99});
//        Task4.task4(new int[]{4,5,6,78,11,1,2,6,7,99});
//        Task5.task5(new int[]{98,1,1,1,1,1,4,5,6,78,11,1,2,6,7,99});
        Task6.task6(new int[]{8,11,1,2,6,7,99,0});
    }

    static void showIntArray(int[] array, String message) {
        System.out.println(message);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void arraySort(int[]array){
        for (int i = array.length - 1; i > 0 ; i--) {
            for (int k = 0; k < i; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
    }
}
//7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
//8. Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.