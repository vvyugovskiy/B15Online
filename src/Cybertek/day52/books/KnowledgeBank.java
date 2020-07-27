package Cybertek.day52.books;

public interface KnowledgeBank  {

    public abstract void takeNotes ();

    public default void showTableContent (){
        System.out.println("Chapter 1 till Chapter 10 : you do the rest");
    }

}
