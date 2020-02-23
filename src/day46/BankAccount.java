package day46;

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    // always add no arg constructor in super class
    // to avoid error in sub class because of super() call
    public BankAccount() { }

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        // super () ;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) { balance += amount; }

    public void withdraw (int amount) { balance -= amount; }

}
