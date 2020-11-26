package unit4.classesAndObjects.task6;

/**
 * 6. Составьте описание класса для представления времени.
 * Предусмотрите возможности установки времени и изменения его отдельных полей (час, минута, секунда)
 * с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class Task6 {
    public static void main(String[] args) {
        Time time = new Time(1, 3, 55);
        System.out.println(time);

        time.changeTime(3,45,1);
        System.out.println(time);

        time.changeTime(0,0,65);
        System.out.println(time);

        time.setHour(4);
        System.out.println(time);

        time.changeTime(-2,0,-55);
        System.out.println(time);
    }
}
