package practice.String;

public class ProveStringIsImmutable {

    public static void main(String[] args) {

        String s1 = "JAVA";
        System.out.println(s1);
        System.out.println(s1.hashCode());
        String s2 = "JAVA";
        System.out.println(s1==s2);
        s1=s1+"J2EE";
        System.out.println(s1);
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());


    }
}
