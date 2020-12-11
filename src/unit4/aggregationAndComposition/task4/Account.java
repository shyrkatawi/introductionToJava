package unit4.aggregationAndComposition.task4;

import java.util.StringJoiner;

class Account {
    private static int idCounter = 101;
    private int id;
    private boolean isBlocked = false;
    private Owner owner;
    private int balance;

    Account(Owner owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        id = idCounter;
        idCounter++;
    }

    int getId() {
        return id;
    }

    int getBalance() {
        return balance;
    }

    void blockAccount() {
        isBlocked = true;
    }

    void unblockAccount() {
        isBlocked = false;
    }

    Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        String blockInfo;
        if (isBlocked) {
            blockInfo = "is blocked";
        } else {
            blockInfo = "is not blocked";
        }
        StringJoiner sj = new StringJoiner(", ");
        sj.add("id=" + id);
        sj.add(owner.toString());
        sj.add("balance=" + balance);
        sj.add("account " + blockInfo);

        return sj.toString();
    }
}
