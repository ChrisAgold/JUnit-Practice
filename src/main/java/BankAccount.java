public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    // Constructor
    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // Methods //
    // Deposit, The branch argument is true if the customer is performing the transaction
    // at a branch with the teller, It's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }
    public double withdrawl(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    public double getbalance() {
        return balance;
    }

    // More methods that use firstName, lastName, and perform other functions



}
