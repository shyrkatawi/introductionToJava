package unit2.arrays;

public class Task5 {
    //5. Даны целые числа а1, а2 ,..., аn .
    //Вывести на печать только те числа, для которых аi > i.(больше своего индекса)
    static void task5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]>i){
                System.out.println(array[i]);
            }
        }
    }
}
