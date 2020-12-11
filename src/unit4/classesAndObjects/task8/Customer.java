package unit4.classesAndObjects.task8;

class Customer {
    private static int idCounter = 1;
    private final int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private long creditCardNumber;
    private long bankAccountNumber;

    Customer(String lastName, String firstName, String middleName, String address, long creditCardNumber, long bankAccountNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.id = idCounter;
        idCounter++;
    }

    int getId() {
        return id;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getMiddleName() {
        return middleName;
    }

    void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    long getCreditCardNumber() {
        return creditCardNumber;
    }

    void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    long getBankAccountNumber() {
        return bankAccountNumber;
    }

    void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "id=" + id +
                ", lastName=" + lastName +
                ", firstName=" + firstName +
                ", middleName=" + middleName +
                ", address=" + address +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber;
    }
}
