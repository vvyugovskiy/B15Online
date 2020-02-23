package replit.$_151_200;

public class MethodsWithString3Cover_180 {
    public static void main(String[] args) {
        System.out.println(coverString("Certified Wooden Spoon", "hi")); //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        String newString = "";
        for (int i = 0; i < main.length(); i++) {
            if (main.contains(coverME)) {
                newString=main.replace(coverME,"["+coverME+"]");
                //break;
            }else{
                newString="["+main+"]";
            }
        }
        return newString;
    }
}
