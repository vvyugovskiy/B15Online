package practice;

public class StringMethods {
    public static void main(String[] args) {

        String s1; // this line is just declaring a variable
        s1 = "All wE neED is LoVe!"; // this line is assigning the value

        String message = "something"; // this line is declaring and assigning the value
        // assigning the value for the first time, also called initializing
        message = "something else"; // changing the value, reassigning

        String s2 = "love";
        String s3 = "LoVe";
        String s4 = "love";
        String s5 = new String("love");
        System.out.println(s4.equals(s5)); // true
        // System.out.println(s4==s5); // false

// equals Method / str1.equals(str2) --> true or false
// compares the internal value of a string to another string,
// no matter whether it is stored in the string pool or as a stand alone object
        System.out.println(s2.equals(s3)); // false
        System.out.println(s2.equals(s4)); // true
        System.out.println("rOSe".equals("rose")); // false
        System.out.println("rOSe".equals("rOSe")); // true
        boolean b1 = s3.equals(s4);
        System.out.println(b1); // false
        boolean b2 = "rOSe".equals("rOSe");
        System.out.println(b2); // true


// equalsIgnoreCase Method / str1.equalsIgnoreCase(str2) --> true or false
// storing the result of equality check without caring about case, into boolean variable
        boolean b3 = s2.equalsIgnoreCase(s3);
        System.out.println(b3); //true

// lengthOfStr Method / str1.length()
// In order to get how many character we have inside String,
// we can use length method of String. It will count each and every
        String str1 = "LoVe";
        System.out.println(str1.length()); // 4

// charAt Method / str1.charAt(char index)
// it will return a character at certain location specified
        // character count is 4
        // index  -->   0123
        String aName = "Jane";
        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);
        System.out.println(c1 + c2 + c3 + c4); //382 total of ASCII codes
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4); // J a n e
        System.out.println(c1 + c2 + c3 + " " + c4); // 281 e
        System.out.println(c1 + "" + c2 + c3 + c4); // Jane
        System.out.println("" + c1 + c2 + c3 + c4); // Jane

// toUpperCase Method / str1.toUpperCase()
// toUpperCase method of String is used to make String all character uppercase
        String str2 = "LoVe";
        System.out.println(str2);               // LoVe
        System.out.println(str2.toUpperCase());  // LOVE

// toLowerCase Method / str1.toLowerCase()
// toLowerCase method of String is used to make String all character lowercase
        String str3 = "LOVE";
        System.out.println(str3);              // LOVE
        System.out.println(str3.toLowerCase()); // love

// contains Method / str1.contains(“AnotherStr”) --> true or false
// it checks whether a string exists in another string
        String str4 = "All wE neED is LoVe!";
        System.out.println(str4.contains("love")); // false
        System.out.println(str4.contains("LoVe")); // true

// indexOf Method / str1.indexOf(str2)
// finds the index (beginning to end) of another String within this string
// -1 if not found
//                     01234567890123456789
        String str5 = "All wE neED is LoVe!"; // length is 20 , last char index is 19
        System.out.println("find out the location of is");
        System.out.println(str5.indexOf("is"));        // 12
        System.out.println("find out the location of E");
        System.out.println(str5.indexOf("E"));        // 5
        // if the location is not found, we get minus number
        System.out.println("find out the location of uppercase O");
        System.out.println(str5.indexOf("O"));        // -1
        System.out.println("find out the location of first space  ");
        System.out.println(str5.indexOf(" "));        // 3

// indexOf(anotherStr,fromIndex) Method / str1.indexOf("a",3)
// it searches for occurrences of anotherString within original String
// STARTING FROM A STATED INDEX LOCATION
// -1 if not found
//                     01234567890123456789
        String str6 = "All wE neED is LoVe!"; // length is 20 , last char index is 19
        int x = str6.indexOf("e");
        System.out.println(x); // 8
        int y = str6.indexOf("e", 9);
        System.out.println(y); // 18, it will look for first e starting from index 9
        int z = str6.indexOf("A", 1); // -1
        System.out.println(z);

// lastIndexOf Method / str1.lastIndexOf(str2)
// finds the index (end to beginning) of another String within this string
// -1 if not found
//                     01234567890123456789
        String str7 = "All wE neED is LoVe!"; // length is 20 , last char index is 19
        System.out.println("find out last location the letter E shows up");
        System.out.println(str7.lastIndexOf("E"));    // 9
        System.out.println("find out last location the character space shows up");
        System.out.println(str7.lastIndexOf(" "));    // 14
        System.out.println("find out last location is shows up");
        System.out.println(str7.lastIndexOf("is")); // 12
        System.out.println("find out last location us shows up");
        System.out.println(str7.lastIndexOf("us")); // -1

// lastIndexOf(anotherStr,fromIndex) Method / str1.lastIndexOf("a",3)
// index looking from end to beginning order. -1 if not found
// it starts looking backwards from the specified index “fromIndex”.
//                     01234567890123456789012
        String str8 = "All is wE neED is LoVe!";
        int a = str8.lastIndexOf("E", 10);
        System.out.println(a);  // 8
        int b = str8.lastIndexOf("is", 8);
        System.out.println(b);  // 4
        int c = str8.lastIndexOf("e", 4);
        System.out.println(c);  // -1

// substring Method / str1.substring(beginningIndex,EndingIndex)
// returns substring from given begin index till right before end index
//                     01234567890123456789
        String str9 = "All wE neED is LoVe!"; // length is 20 , last char index is 19
        String p1 = str9.substring(4, 6);
        System.out.println(p1);  // wE
        String p2 = str9.substring(0, 1);
        System.out.println(p2);  // A
        String p3 = str9.substring(10, 14);
        System.out.println(p3);  // D is
        // String p4 = str9.substring(17,24);
        // System.out.println( p4 );  // -> Exception at runtime

// substring Method / str1.substring(beginningIndex)
// returns substring from given begin index till the end of String
//                      01234567890123456789
        String str10 = "All wE neED is LoVe!"; // length is 20 , last char index is 19
        String k1 = str10.substring(9);
        System.out.println(k1);  // ED is LoVe!
        String k2 = str10.substring(16);
        System.out.println(k2);  // oVe!
        //String k3 = str10.substring(21);
        //System.out.println( k3 );  // -> Exception at runtime

// isEmpty Method / str1.isEmpty()
// returns true if string is Empty , false if not
        String str11 = "";
        boolean r1 = str11.isEmpty();
        System.out.println(r1);// true
        String str12 = "LoVe!";
        boolean r2 = str12.isEmpty();
        System.out.println(r2);// false

//isBlank Method / str1.isBlank()
// isEmpty -->  if yourString.length()>0  false else it's true
// isBlank -->  if you have only white spaces, get true, else get false
        String str13 = "     ";
        boolean r3 = str13.isBlank();
        System.out.println(r3); // true
        boolean r4 = str13.isEmpty();
        System.out.println(r4); // false

// startsWith Method / str1.startsWith(str2)
// Check if a String starts with another string. IT IS CASE SENSITIVE!
        String name = "Jane";
        System.out.println(name.startsWith("Ja"));    // true
        System.out.println(name.startsWith("ja"));    // false
        System.out.println(name.toLowerCase().startsWith("ja")); // true

// endsWith Method / str1.endsWith(str2)
// Check if a String ends with another string. IT IS CASE SENSITIVE!
        String name1 = "Jane";
        System.out.println(name1.endsWith("e"));        // true
        System.out.println(name1.endsWith("E"));        // false

// trim Method / str1.trim()
// trim method is used to take out spaces on two sides, not in between!!!!!
        String message1 = "    All wE neED is LoVe!       ";
        System.out.println(message1);
        System.out.println("message1 character count is " + message1.length()); //31
        message1 = message1.trim();
        System.out.println(message1); // All wE neED is LoVe!
        System.out.println("message character count is " + message1.length());  //20

// concat Method / str1.concat(str2)
// concatenates the specified string
        String str14 = "Life is";
        String str15 = str14.concat(" beautiful, enjoy!");
        System.out.println(str15);// Life is beautiful, enjoy!

// replace Method / str1.replace(‘oldChar’,’newChar’)
// replaces all occurrences of the Char index specified char value
        String f1 = "All we need is love!";
        String f2 = f1.replace('e', 'E');
        System.out.println(f2); // All wE nEEd is lovE!
        String f3 = f1.replace('k', 'l');
        System.out.println(f3); // All we need is love!
        // if not found, it will be just ignored

// replace Method / str1.replace(“oldStr”,“newStr”)
// replaces all occurrences of the specified string value
        String m1 = "All we need is love!";
        String m2 = m1.replace("love", "chocolate");
        System.out.println(m2); // All we need is chocolate!
        String m3 = m1.replace("apple", "love");
        System.out.println(m3); // All we need is love!
        // if not found, it will be just ignored

    }

}
