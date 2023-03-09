import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    public static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        Book book1 = new Novel( "Book1", 100, "Fantasy");
        Book book2 = new Novel("Book2", 159, "Adventure");
        Book book3 = new ArtAlbum("Book3", 203, "Good");

        addBook(book1);
        addBook(book2);
        addBook(book3);

        System.out.println(book1.toString());
        System.out.println(book3.toString());

        listAllBooks();


    }

    /**
     * @param book to add a book to the book list
     */
    public static void addBook(Book book) {
        books.add(book);
    }

    /**
     * @param book to remove a book from the book list
     */
    public static void removeBook(Book book) {
        books.remove(book);
    }

    /**
     * Prints the names and the pages of all the books that are in the book list
     */
    public static void listAllBooks() {
        for(Book book : books) {
            System.out.println("Name:" + book.name + " NumberOfPages:" + book.numberOfPages);
        }
    }




}