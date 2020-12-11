package unit4.aggregationAndComposition.task2;

/**
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
class Car {
    private int amountOfFuel = 77;
    private String mark;
    private Wheel wheel;
    private Engine engine;

    Car(String mark, Wheel wheel, Engine engine) {
        this.mark = mark;
        this.wheel = wheel;
        this.engine = engine;
    }

    void startMotion() {
        System.out.println("go");
    }

    void endMotion() {
        System.out.println("stop");
    }

    void fill(int additionalFuel) {
        this.amountOfFuel += additionalFuel;
    }

    void changeWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    void printMark() {
        System.out.println(mark);
    }
}

