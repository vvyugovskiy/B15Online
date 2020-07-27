package practice.String;

public class StringToIntegerAndBack {

    public static void main(String[] args) {

        String s = "2015";
        int i = Integer.parseInt(s);
        System.out.println(i + 3);

        int i1 = 2015;
        String s1 = Integer.toString(i1);
        String s2 = String.valueOf(i1);
        System.out.println("Integer.toString(i1) :: " + s1 + 3);
        System.out.println("String.valueOf(i1) :: " + s2 + 4);
    }
}
