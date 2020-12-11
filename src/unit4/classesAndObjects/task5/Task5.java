package unit4.classesAndObjects.task5;


/**
 * 5. Опишите класс, реализующий десятичный счетчик,
 * который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
 * Написать код, демонстрирующий все возможности класса.
 */
class Task5 {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println(counter1);
        counter1.increaseValue();
        System.out.println(counter1);
        counter1.decreaseValue();
        counter1.decreaseValue();
        System.out.println(counter1);

        Counter counter2 = new Counter(4,10,11);
        System.out.println(counter2);
        counter2.increaseValue();
        counter2.increaseValue();
        System.out.println(counter2);

        System.out.println(counter2.getCurrentValue());
    }


}
