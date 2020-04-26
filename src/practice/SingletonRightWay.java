package practice;

import java.util.Arrays;

public enum  SingletonRightWay {

    // Joshua Bloch explained this approach in his Effective Java Reloaded talk at Google I/O 2008: link to video. Also see slides 30-32 of his presentation (effective_java_reloaded.pdf):

    INSTANCE;
    private final String [] favoriteSong = {"Hound Dog","Heartbreaking Hotel"};
    public  void printFavorites(){
        System.out.println(Arrays.toString(favoriteSong));
    }

    public static void main(String[] args) {
        SingletonRightWay s1;
    }
}
