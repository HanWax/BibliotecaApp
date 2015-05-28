import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CollectionManagerTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void hasListOfLibraryBooks() {
        CollectionManager cm = new CollectionManager();
        Book b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        cm.addBook(b);
        assertEquals(cm.listBookCollection(), "HeadFirst Java ");
    }

    @Test
    public void unavailableBooksNotListed() {
        CollectionManager cm = new CollectionManager();
        Book b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        cm.addBook(b);
        cm.checkoutBook(b);
        assertEquals(cm.listBookCollection(), "");
    }

    @Test
    public void canCheckoutBooks() {
        CollectionManager cm = new CollectionManager();
        Book b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        cm.addBook(b);
        assertEquals(cm.checkoutBook(b), "Thank you! Enjoy the book");
        assertEquals(b.isAvailable, false);
    }

    @Test
    public void cannotCheckoutBooksNotInCollection() {
        CollectionManager cm = new CollectionManager();
        Book b = new Book("The Hobbit", "JRR Tolkein", 1937);
        assertEquals(cm.checkoutBook(b), "That book is not available.");

    }

    @Test
    public void cannotCheckoutUnavailableBooks() {
        CollectionManager cm = new CollectionManager();
        Book b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        b.isAvailable = false;
        cm.addBook(b);
        assertEquals(cm.checkoutBook(b), "That book is not available.");

    }

    @Test
    public void canReturnBooks() {
        CollectionManager cm = new CollectionManager();
        Book b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        cm.addBook(b);
        cm.checkoutBook(b);
        assertEquals(b.isAvailable, false);
        assertEquals(cm.returnBook(b), "Thank you for returning the book.");
        assertEquals(b.isAvailable, true);
    }

    @Test
    public void cannotReturnAvailableBooks() {
        CollectionManager cm = new CollectionManager();
        Book b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        cm.addBook(b);
        assertEquals(cm.returnBook(b), "That is not a valid book to return.");
    }

    @Test
    public void cannotReturnBooksNotInCollection() {
        CollectionManager cm = new CollectionManager();
        Book b = new Book("The Hobbit", "JRR Tolkein", 1937);
        cm.returnBook(b);
        assertEquals(cm.returnBook(b), "That is not a valid book to return.");
    }


}