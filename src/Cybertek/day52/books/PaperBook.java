package Cybertek.day52.books;

public class PaperBook extends Book implements Readable{

    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Paper book's name is : "+name+", and the autor is : "+author+" and it's weight: "+weight+" pounds");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNotes (){
        System.out.println("Bookmark and Take note from "+name);
    }

    @Override
    public void read() {
        System.out.println("Reading the "+name+" written by "+author);
    }
}
