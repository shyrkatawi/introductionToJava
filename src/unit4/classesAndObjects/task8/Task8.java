package unit4.classesAndObjects.task8;

/**
 * 8. Создать класс Customer, спецификация которого приведена ниже.
 * Определить конструкторы, set и get методы, метод toString().
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer:
 * —id,
 * —фамилия,
 * —имя,
 * —отчество,
 * —адрес,
 * —номер кредитной карточки,
 * —номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Task8 {
    public static void main(String[] args) {
        Customers customers = new Customers(
                new Customer("adf", "firstName1", "middleName1",
                        "address1", 112233, 111222111),
                new Customer("bret", "firstName2", "middleName2",
                        "address2", 222233, 222222111),
                new Customer("cetby", "firstName3", "middleName3",
                        "address3", 332233, 333222111),
                new Customer("zxfzvs", "firstName4", "middleName4",
                        "address4", 442233, 444222111),
                new Customer("aca", "firstName5", "middleName5",
                        "address5", 552233, 555222111));

        customers.showCustomers();
        customers.sortByLastName();
        customers.showCustomers();
        customers.showCustomersByCreditCardInterval(111111, 333333);
    }
}
