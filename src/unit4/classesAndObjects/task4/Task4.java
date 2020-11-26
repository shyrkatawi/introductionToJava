package unit4.classesAndObjects.task4;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train,
 * добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массива по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */
public class Task4 {
    public static void main(String[] args) throws ParseException {
        Train[] trains = new Train[5];
        trains[0] = new Train("af", 1, 11,11);
        trains[1] = new Train("ba", 3, 12,21);
        trains[2] = new Train("ca", 2, 4,40);
        trains[3] = new Train("ad", 5, 2,22);
        trains[4] = new Train("af", 4, 9,9);

        showArray(trains);

        Arrays.sort(trains, Comparator.comparing(Train::getNumber));
        showArray(trains);

        Arrays.sort(trains, (o1, o2) -> {
            if(o1.getDestination().equals(o2.getDestination())){
                return o1.getDepartureTime().compareTo(o2.getDepartureTime());
            }
            else {
                return o1.getDestination().compareTo(o2.getDestination());
            }
        });
        showArray(trains);


    }

    static <T> void showArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
        System.out.println();
    }
}
