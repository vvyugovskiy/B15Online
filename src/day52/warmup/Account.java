package day52.warmup;

public class Account implements Transferable, Comparable<Account> {

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // add logic to compare by balance
    @Override
    public int compareTo(Account otherAccount) {
        if (this.balance > otherAccount.balance) {
            return 1;
        } else if (this.balance < otherAccount.balance) {
            return -1;
        } else {
            return 0;
        }
    }

        @Override
        public void transferAll (Account otherAccount){
            // get the balance of current account
            // deposit to the other account
            otherAccount.balance += this.balance;
            // set current account balance to 0
            this.balance = 0;

        }

        public int getBalance () {
            return balance;
        }

        public void deposit ( int amount){
            balance += amount;
        }
        public void withdraw ( int amount){
            balance -= amount;
        }

        @Override
        public String toString () {
            return "Account{" +
                    "name='" + name + '\'' +
                    ", balance=" + balance +
                    '}';
        }

        // if reversed String equals to original String than it is palindrom
        public boolean isPalindrom () {

            String nameCopy = this.name.toLowerCase().replace(" ", "");
            String reveseResult = "";
            for (int i = nameCopy.length() - 1; i >= 0; i--) {
                reveseResult += nameCopy.charAt(i);
            }
            return nameCopy.equals(reveseResult);
        }


    }
