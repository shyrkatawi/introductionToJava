package unit2.arrays;

public class Task9 {
    //9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
    //Если таких чисел несколько, то определить наименьшее из них.
    static void task9(int[] array) {
        Main.showArray(array);
        //наиболее часто повторяющееся число
        int mostCommon = array[0];
        //счетчик повторений
        int counter = 0;
        //количество повторений у предыдущего числа
        int counterPrev = 0;
        //сравниваем каждое число последовательно со всем массивом и определяем число повторений для него
        for (int i : array) {
            for (int k : array) {
                if (i == k) {
                    counter++;
                }
            }
            //Если количество повторений у нового числа выше, чем у предыдущего, устанавливаем новое наиболее часто встречающееся число.
            //Обновляем счётчик для предыдущего наиболее часто встречающегося числа
            if (counter > counterPrev) {
                mostCommon = i;
                counterPrev = counter;
            }
            //если кол-ва повторений равны, выбираем наименьшее из чисел
            else if (counter == counterPrev && i < mostCommon) {
                mostCommon = i;
            }
            //обнуляем счетчик
            counter = 0;
        }
        System.out.println(mostCommon);
    }
}
