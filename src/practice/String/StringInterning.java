package practice.String;

public class StringInterning {

    public static void main(String[] args) {

        String a = "interned String";
        String b = new String ("interned String");
        String c = b.intern();
        System.out.println(a==c); // true
        System.out.println(a==b); // false
        System.out.println(b==c); // false

        String s = "age: 47";
        s=s.replaceAll("\\D","");
        System.out.println(s+12);
        int s1 = Integer.parseInt(s);
        System.out.println("s1 = " + (s1+12));


        String n = "Hello im 12th in line";
        n=n.replaceAll("\\D","").trim(); // replaces all letters with "" but lives spaces
        int n1 = Integer.parseInt(n); // turn String 12 into int 12
        System.out.println(">"+n1+"<"); // to make sure there is no spaces presented
    }
}
