package day46;

public class AtTheBank {

    public static void main(String[] args) {

        CheckingAccount acc1 = new CheckingAccount("Zegra", 54321,10000);
        System.out.println("acc1 = " + acc1);
        acc1.deposit(5000);
        System.out.println("acc1 = " + acc1);
        acc1.deposit(5300);
        System.out.println("acc1 = " + acc1);
    }

}
