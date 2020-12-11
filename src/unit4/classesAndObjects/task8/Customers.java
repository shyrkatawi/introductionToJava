package unit4.classesAndObjects.task8;

import java.util.Arrays;
import java.util.Comparator;

class Customers {
    Customer[] customers;

    Customers(Customer... customers) {
        this.customers = customers;
    }

    void showCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println();
    }

    void sortByLastName() {
        Arrays.sort(customers, Comparator.comparing(Customer::getLastName));
    }

    void showCustomersByCreditCardInterval(long intervalMin, long intervalMax) {
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() >= intervalMin && customer.getCreditCardNumber() <= intervalMax) {
                System.out.println(customer);
            }
        }
    }
}
