package Cybertek.day15;

public class SubStringPractice {
    public static void main(String[] args) {

        // getting the part of the String out of another String
        //

        String movie = "Lord Of The Ring";
        String wordOf = movie.substring(8, 11);
        // i want to get the word (Of) from this movie
        System.out.println(wordOf);

        int start = movie.indexOf(" ") + 1;
        int end = movie.length();

        System.out.println("Second word till last : " + movie.substring(start, end));

        String secondWordTillLast = movie.substring(5, 16);
        System.out.println("second Word Till Last = " + secondWordTillLast);
                                // OR

        String secondToLast = movie.substring(5);
        System.out.println("second To Last = " + secondToLast);
        
        // reverse Lord Of The Ring into Ring Of The Lord
        
        String lord = movie.substring(0,4);
        System.out.println("lord = " + lord);
        String ring = movie.substring(11,16);
        String ofthe = movie.substring(4,12);
        System.out.println("ofthe = " + ofthe);
        System.out.println("ring = " + ring);
        System.out.println(ring+ofthe+ "Cybertek " +lord);



        
    }
}
