package day14;

public class EmailChecker {
    public static void main(String[] args) {
        String email = "v.vyugovskiy@mail.ru";
        // does not contain @, if has space
        // endsWith @gmail.com --> Gmail
        //@yahoo.com
        // @mail.ru --> Russian Email
        boolean dogSpace = !email.contains("@") || email.contains(" ");
        boolean ends1 = email.endsWith("@gmail.com");
        boolean ends2 = email.endsWith("@yahoo.com");
        boolean ends3 = email.endsWith("@mail.ru");

        if (dogSpace) {
            System.out.println("Good email");
        } else if (ends1) {
            System.out.println("GOOGLE Mail");
        } else if (ends2) {
            System.out.println("YAHOO Mail");
        } else if (ends3) {
            System.out.println("MAIL.RU");
        } else {
            System.out.println("INVALID EMAIL");
        }
    }
}
