import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Integer> booksIssuense = new ArrayList<>();
    private List<Book> library;

    public void bookIssuance(int index){
        System.out.println("Книга " + library.get(index).getName() + " была выдана");
        booksIssuense.add(index);
    }

    public void bookIssuenseList() {
        System.out.println("Были выданы книги: ");
        for (int i : booksIssuense) {
            System.out.println("- " + library.get(i).getName());
        }
    }

    public Library (List<Book> books){
        library = books;
    }

}
