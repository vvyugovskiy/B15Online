package practice.String;

public class ReverseStringWithSpecialCharacters {

    public static String reverse (String sentence){
        char[] arr = sentence.toCharArray();
        for (int i=0,j=arr.length-1; i<j; i++,j--){
            while(!Character.isLetterOrDigit(arr[i])){
                i++;
            }
            while (!Character.isLetterOrDigit(arr[j])){
                j--;
            }
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return new String (arr);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello<@#$>My, Frinds<%^&>,And <*()> World!"));

    }
}
