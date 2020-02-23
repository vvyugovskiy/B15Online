package day52.books;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookCounting {

    public static void main(String[] args) {

        Book b1 = new PaperBook("Java","Akbar",3);
        Book b2 = new PaperBook("Selenium","Vasyl",2);
        Book b3 = new AudioBook("Agile","Guljannat",1.8);
        Book b4 = new PaperBook("The Kite Runner","Khaled Hosseini",3);
        Book b5 = new PaperBook("Lord of the Rings","J. R. R. Tolkien",2000);
        Book b6 = new AudioBook("Game of Thrones","George R. R. Martin",95.5);

        List<Book> lst = Arrays.asList(b1,b2,b3,b4,b5,b6);

        int pCount = 0;
        int aCount = 0;
        for (Book each : lst) {
            String className = each.getClass().getSimpleName();
            System.out.println(className);
            if (className.equals("PaperBook")) {
            ++pCount;
            }else if (className.equals("AudioBook")) {
            ++aCount;
            }
        }

        System.out.println("PaperBook count = " + pCount);
        System.out.println("AudioBook count = " + aCount); // !!!
    }
}
