package office_hours;


public class Practice_11_27 {
    public static void main(String[] args) {
        String message = "  I LOVE Java    ";

        System.out.println("message = <" + message+">");
        String mesTrimed = message.trim();
        System.out.println("mesTrimed = <" + mesTrimed+">");

        String emptySpaces = "                ";
        System.out.println("emptySpaces " + emptySpaces.length());
        System.out.println("emtySpaces =<" + emptySpaces+">");
        String emptyAfterTrim = emptySpaces.trim();
        System.out.println("emptyAfterTrim.length() = " + emptyAfterTrim.length());
        System.out.println("emptyAfterTrim.length() = " + emptyAfterTrim.isEmpty());

        // isEmpty VS isBlank
        // isBlank --> if you have only white spaces, get true, else get false
        System.out.println("emptySpaces is blank or not ??   "+emptySpaces.isBlank());

        // indexOf --> give you location of the String you need inside another String
        //

        // contains : --> check whether a String exists inside another String and return true false
        // works exactly same as --> yourString.indexOf("anotherStr") > -1

        boolean m = message.contains("LOVE");
        System.out.println("message With love = " + m);




    }


}
