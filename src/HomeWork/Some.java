package HomeWork;

public class Some {
    public static void main(String[] args) {

    String s = " My age is 33";
    int s1 = Integer.parseInt(s.replaceAll("\\D+",""));
        System.out.println(s1+17);
}
}