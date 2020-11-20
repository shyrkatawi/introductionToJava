package unit2.arrays;

public class Task10 {
    //10. Дан целочисленный массив с количеством элементов n.
    //Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
    //Примечание: Дополнительный массив не использовать.
    static void task10(int[] array) {
        Main.showArray(array);
        for (int i = 1; i < array.length; i++) {
            if(i*2<array.length){
                array[i] = array[i*2];
            }
            else {
                array[i]=0;
            }
        }
        Main.showArray(array);
    }
}
