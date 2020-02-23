package day52.warmup;

public class BankTest {

    public static void main(String[] args) {

        Account a1 = new Account("Raufuar", 10000);
        Account a2 = new Account("Max", 7000);

        System.out.println("a1 before = " + a1);
        System.out.println("a2 before = " + a2);

        a1.transferAll(a2);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        System.out.println(a1.isPalindrom());
        System.out.println(a2.isPalindrom());
        // a2.deposit(3000);

        System.out.println(a1.compareTo(a2));
    }
}
