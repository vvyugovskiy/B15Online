package Cybertek.day52.books;

public class AudioBook extends Book {

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    public void listen() {
        System.out.println("listening the audio book " + name + " by " + author);
    }

    @Override
    public void displayInfo() {
        System.out.println("The name of audioBook is " + name + " and " + "the author is " + author +
                ", the duration is " + duration + " min.");
    }

    @Override
    public void takeNotes() {
        System.out.println("Taking note on the digital book by " + name + " writing the provided digital table");
    }

    @Override
    public void showTableContent() {
        System.out.println("If you want to see Table of Content of " + name
                + " by " + author + " press ...");
    }
}