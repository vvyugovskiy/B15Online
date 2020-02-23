package practice.mentors.Omer;

public class Omer_ABCDE_Printer {
    public static void main(String[] args) {
        String harf = "abcde";
        int count = 0;

        for (int a = 0; a < harf.length(); a++) {
            for (int b = 0; b < harf.length(); b++) {
                for (int c = 0; c < harf.length(); c++) {
                    for (int d = 0; d < harf.length(); d++) {
                        for (int e = 0; e < harf.length(); e++) {
                            if (d == e || c == e || c == d || b == e || b == d || b == c || a == e || a == d || a == c || a == b)
                                continue;
                            System.out.printf("%c%c%c%c%c\n", harf.charAt(a), harf.charAt(b), harf.charAt(c), harf.charAt(d), harf.charAt(e));
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println("total: " + count);

    }
}
