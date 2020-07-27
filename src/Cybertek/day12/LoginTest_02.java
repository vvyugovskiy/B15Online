package Cybertek.day12;

public class LoginTest_02 {
    public static void main(String[] args) {
        String userName, password;
        userName = "abc123";
        boolean userNameCorrect = userName.equals("ABC123");
        System.out.println(userNameCorrect);

        boolean userNameCorrect2 = userName.equalsIgnoreCase("ABC123");
        System.out.println(userNameCorrect2);

        String myName = "Vladislav";
        boolean myNameCorrect = myName.equals("Vladislav");
        System.out.println(myNameCorrect);
        boolean myNameCorrect2 = myName.equalsIgnoreCase("VlaDislaV");
        System.out.println(myNameCorrect2);

    }
}
