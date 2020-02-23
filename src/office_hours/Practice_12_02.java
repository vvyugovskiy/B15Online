package office_hours;

public class Practice_12_02 {
    public static void main(String[] args) {

        String item = "Echo Dot (3rf Gen) Charcoal";
        // Get what is inside ()
        // find out index of , use them for substring

        System.out.println(item.substring(9, 18));
        System.out.println(item.substring(10, 17));

        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndingParenthesis = item.indexOf(")");
        String wordInsideParenthesis = item.substring(indexOfOpeningParenthesis + 1, indexOfEndingParenthesis);
        System.out.println("word Inside Parenthesis = " + wordInsideParenthesis);

        String letters = "J%a^V**$1a(";
        // remove % ^ * 1 $ (
        letters = letters.replace( "%","")
                .replace("^","")
                .replace("*","")
                .replace("1","")
                .replace("$","")
                .replace("(","");
        System.out.println(letters);
    }
}
