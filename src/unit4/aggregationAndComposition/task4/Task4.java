package unit4.aggregationAndComposition.task4;

/**
 * 4. Счета. Клиент может иметь несколько счетов в банке.
 * Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов.
 * Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
class Task4 {
    public static void main(String[] args) {
        Owner owner1 = new Owner("ownerName1");
        Owner owner2 = new Owner("ownerName2");
        Owner owner3 = new Owner("ownerName3");
        Account account1 = new Account(owner1, 10);
        Account account3 = new Account(owner2, -2);
        Account account2 = new Account(owner1, -10);
        Account account5 = new Account(owner2, 22);
        Account account4 = new Account(owner2, 2);
        Account account6 = new Account(owner3, 3);
        Bank bank = new Bank();
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);
        bank.addAccount(account6);
        bank.printInformation();

        bank.blockAccountById(102);
        bank.printInformation();

        bank.printInformationByOwnerName("ownerName2\n");

        System.out.println("sorted by id");
        bank.sortById();
        bank.printInformation();
        System.out.println("sorted by balance");
        bank.sortByAccountBalance();
        bank.printInformation();
        System.out.println("sorted by owner");
        bank.sortByOwner();
        bank.printInformation();

        bank.printSumOfEveryBalance();
        bank.printSumOfEveryNegativeBalance();
        bank.printSumOfEveryPositiveBalance();
    }
}
