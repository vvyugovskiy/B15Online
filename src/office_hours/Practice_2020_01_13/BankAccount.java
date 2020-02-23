package office_hours.Practice_2020_01_13;

public class BankAccount {

    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;

    // setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance) {

        accountHolder = newAccountHolder;
        accountType = newAccountType;
        accountNumber = newAccountNumber;
        balance = newBalance;
    }

    // show accountBalance
    public void showAccountBalance() {

        System.out.println("Current balance = " + balance);

    }
    //showAccountHolderAccountType

    public void showAccountHolderType() {

        System.out.println("Account Type = " + accountType);

    }

    // getBalance / return the balance
    public double getBalance() {

        return balance;
    }

    // deposit (amount)
    public void deposit(double amount) {

        balance = balance + amount; // balance+=amount
    }

    // withdraw (amount)
    public void withdraw (double amount){

        balance-=amount;

    }

    // withdraw100$Cash()
    public void withdraw100$Cash (){
        withdraw(100); // reusing the functionality we have
        // or balance = balance - 100
    }

    // purchaseProduct (productPrice, count)

    public void purchaseProduct (double productPrice, int count){
        double totalPrice = productPrice*count;
        balance -= totalPrice;
        // or
        //or withdraw (totalPrice) ;
    }

    //toString

     public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
