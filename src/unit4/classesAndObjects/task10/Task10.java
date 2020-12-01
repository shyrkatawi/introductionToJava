package unit4.classesAndObjects.task10;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;

/**
 * 10. Создать класс Airline, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline:
 * -пункт назначения,
 * -номер рейса,
 * -тип самолета,
 * -время вылета,
 * -дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Task10 {
    public static void main(String[] args) throws ParseException {
        Airlines airlines = new Airlines(new Airline[]{
                new Airline("dst1", "1A", "tp1", "11:11", new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.FRIDAY}),
                new Airline("dst2", "2A", "tp1", "09:11", new DayOfWeek[]{DayOfWeek.WEDNESDAY}),
                new Airline("dst1", "3C", "tp1", "14:44", new DayOfWeek[]{DayOfWeek.MONDAY}),
                new Airline("dst3", "4B", "tp1", "22:22", new DayOfWeek[]{DayOfWeek.FRIDAY})
        });
        airlines.showAirlinesByDestination("dst1");
        airlines.showAirlinesByDay(DayOfWeek.FRIDAY);
        airlines.showAirlinesByDayAndAfterSpecifiedTime(DayOfWeek.MONDAY,
                new SimpleDateFormat("HH:mm").parse("12:00"));
    }
}
