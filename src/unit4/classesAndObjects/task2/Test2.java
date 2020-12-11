package unit4.classesAndObjects.task2;

/**
 * 2. Создйте класс Test2 двумя переменными.
 * Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию.
 * Добавьте set- и get- методы для полей экземпляра класса.
 */
class Test2 {
    int a;
    int b;

    Test2() {
        this.a = 1;
        this.b = 12;
    }

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getA() {
        return a;
    }

    void setA(int a) {
        this.a = a;
    }

    int getB() {
        return b;
    }

    void setB(int b) {
        this.b = b;
    }
}
