package HomeWork;

public class Some {
    public static void main(String[] args) {


    String s = " My age is 33";
    int s2 = Integer.parseInt(s.replaceAll("\\D+",""));
   //int s1 = Integer.parseInt(s);
        System.out.println(s2+17);
}
}