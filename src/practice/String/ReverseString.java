package practice.String;

public class ReverseString {

    public static void main(String[] args) {

// Best way, using String Builder

        String name  = "Albert Aslan";
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println("reversed name :: " + reversed);

// using StringBuffer------------------------------------------------------------------------------------
        StringBuffer sb = new StringBuffer("Hello World!");
        System.out.println("using StringBuffer :: " + sb.reverse());
        System.out.println("recursive :: " + recursiveWayInterningString("Hello World!"));

// Iterative Method------------------------------------------------------------------------
        String str = "Hello World!";
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i) + "";
        }
        System.out.println(newStr);

// Another  iterative method--------------------------------------------------------------------------------
        String s = "Hello World!";
//        String ss = "";
        char[] arr = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(arr[i]);
//             ss+=arr[i];
        }
//        System.out.print(ss);
    }

    // using recursive method-------------------------------------------------------------------------------------
    public static String recursiveWayInterningString(String s) {
        if ((null == s) || (s.length() <= 1)) {
            return s;
        }
        return recursiveWayInterningString(s.substring(1)) + s.charAt(0);
    }

}
