import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book ("Пруступление и наказание");
        Book book2 = new Book (1408);
        Book book3 = new Book (2012);
        Book book4 = new Book ("Гарри Поттер");
        Book book5 = new Book ("Игра престолов");

        List<Book> library = new ArrayList<>(List.of(book1, book2, book3, book4, book5));

        Library books = new Library(library);

        books.bookIssuance(3);
        books.bookIssuance(2);

        System.out.println(" ");
        
        books.bookIssuenseList();








    }
}