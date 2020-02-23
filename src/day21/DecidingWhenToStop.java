package day21;

public class DecidingWhenToStop {
    public static void main(String[] args) {


    /*
    // 01234
    // hello
    while we are going through all characters
    where do we stop in the loop:
                                  4                5
    for 1 character -->> x<=lastCharIndex, x < charCount
                                3(x<=3)            4(x<4)             3(x<=3)
    for 2 characters -->> x<=lastCharIndex-1, x < charCount - 1, x<=charCount -2
                                2(x<=2)            3(x<3)             2(x<=2)
     for 3 characters -->> x<=lastCharIndex-2, x < charCount - 2, x <=charCount-3

     if looking for a word with n characters
        where is my stopping point
                            n-1(n<=n-1)         n(x<n)
        for n char. -->> x<=lastCharIndex-2, x<charCount - n-1,

     */
    String msg = "Hello World";
    int charCount = msg.length();
    int n = 5;
        for (int x = 0; x <= charCount -n; x++) {
            System.out.println(msg.substring(x,x+n));

        }

    }
}
