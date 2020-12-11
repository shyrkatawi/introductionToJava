package unit4.aggregationAndComposition.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bank {
    private List<Account> accounts = new ArrayList<>();

    void addAccount(Account account) {
        accounts.add(account);
    }

    void printInformation() {
        for (Account account : accounts) {
            System.out.println(account);
        }
        System.out.println();
    }

    void blockAccountById(int id) {
        for (Account account : accounts) {
            if (id == account.getId()) {
                account.blockAccount();
            }
        }
    }

    void unblockAccountById(int id) {
        for (Account account : accounts) {
            if (id == account.getId()) {
                account.unblockAccount();
            }
        }
    }

    void printInformationByOwnerName(String name) {
        for (Account account : accounts) {
            if (account.getOwner().getName().equals(name)) {
                System.out.println(account);
            }
        }
    }

    void sortById() {
        accounts.sort(Comparator.comparingInt(Account::getId));
    }

    void sortByOwner() {
        accounts.sort(Comparator.comparing(o -> o.getOwner().getName()));
    }

    void sortByAccountBalance() {
        accounts.sort(Comparator.comparingInt(Account::getBalance));
    }

    void printSumOfEveryBalance() {
        int sum = 0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }
        System.out.println(sum);
    }

    void printSumOfEveryPositiveBalance() {
        int sum = 0;
        for (Account account : accounts) {
            int balance = account.getBalance();
            if (balance > 0) {
                sum += balance;
            }
        }
        System.out.println(sum);
    }

    void printSumOfEveryNegativeBalance() {
        int sum = 0;
        for (Account account : accounts) {
            int balance = account.getBalance();
            if (balance < 0) {
                sum += balance;
            }
        }
        System.out.println(sum);
    }
}
