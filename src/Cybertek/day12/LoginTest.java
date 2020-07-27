package Cybertek.day12;

public class LoginTest {
    public static void main(String[] args) {
        String userName, password;
        userName="User123";
        password= "Pass123";
        if (userName.equals("user123") && password.equals("pass123") ) {
            System.out.println("login successful");
        }else if (! userName.equals("user123") && password.equals("pass123") ) {
            System.out.println("username is not correct");
        }else if (userName.equals("user123") && ! password.equals("pass123") ) {
            System.out.println("password is not correct");
        }else{
            System.out.println("Wrong");
        }



    }
}
