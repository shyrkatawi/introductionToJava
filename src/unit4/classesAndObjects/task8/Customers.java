package unit4.classesAndObjects.task8;

import java.util.Arrays;
import java.util.Comparator;

public class Customers {
    Customer[] customers;

    public Customers(Customer... customers) {
        this.customers = customers;
    }

    public void showCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println();
    }

    public void sortByLastName() {
        Arrays.sort(customers, Comparator.comparing(Customer::getLastName));
    }

    public void showCustomersByCreditCardInterval(long intervalMin, long intervalMax) {
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() >= intervalMin && customer.getCreditCardNumber() <= intervalMax) {
                System.out.println(customer);
            }
        }
    }
}
