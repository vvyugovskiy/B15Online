package day46;

public class CheckingAccount extends BankAccount {

    //    String accountHolder;
    //    long accountNumber;
    //    double balance;
    //      no additional field in checking account lets assume

    public CheckingAccount(String accountHolder, long accountNumber, double balance) {
        super(accountHolder, accountNumber, balance);
    }


    // this awesome bank account will give you 200$ if you deposit over 3000$
    @Override
    public void deposit(int amount) {
        if (amount >= 3000) {
            super.deposit(amount + 200);
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
