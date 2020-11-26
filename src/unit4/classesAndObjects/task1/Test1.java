package unit4.classesAndObjects.task1;

/**
 * 1. Создайте класс Test1 двумя переменными.
 * Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных,
 * и метод, который находит наибольшее значение из этих двух переменных.
 */
public class Test1 {
    int a = 1;
    int b = 2;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    void showVariables() {
        System.out.printf("variable a = %d, variable b = %d", this.a, this.b);
    }

    int getSumOfVariables() {
        return a + b;
    }

    int getMaxVariable() {
        return Math.max(a, b);
    }
}
