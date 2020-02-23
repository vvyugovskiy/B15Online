package day34;

public class LoginActivity {

    // 1, login1 :  static void method
    //	it has two String method paramters
    //			called username and password
    //	(it accept 2 String object as argument when being called)
    //	it check whther username and password  "user" and "abc123"
    //	if yes
    //		print login successful
    //	else
    //		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)
    public static void main(String[] args) {

        login1("hi", "none");
        login1("user", "abc123");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        boolean result = login2("user", "abc123");
        //result = login2("er","dfg6");
        System.out.println("First run : "+result);
        System.out.println("Second run :"+ login2("helloUser","password"));

        if (login2("user1", "abc123")) {

            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View The order ");

        } else {
            System.out.println("NO SHOPPING UNLESS YOU SIGNED IN!!!!!!");
        }
    }

    public static void login1(String username, String passwword) {
        if (username.equals("user") && passwword.equals("abc123")) {
            System.out.println("login successful");
        } else {
            System.out.println("login failed");
        }
    }
    //2, login2 :  static method boolean return type
    //	it has two String method paramters
    //			called username and password
    //	(it accept 2 String object as argument when being called)
    //	it check whther username and password  "user" and "abc123"
    //	if yes
    //		return true
    //	else
    //		return false

    public static boolean login2(String username, String passwword) {
        // 1St WAY
//        if (username.equals("user") && passwword.equals("abc123")) {
//            return true;
//        } else {
//            return false;
//        }

        // SHORTER WAY
        return username.equals("user") && passwword.equals("abc123");
    }
}
