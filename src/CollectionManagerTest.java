import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CollectionManagerTest {

    private CollectionManager cm;
    private Book b;

    @Before
    public void setUp() throws Exception {
        cm = new CollectionManager();
        b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        cm.addBook(b);
    }

    @Test
    public void hasListOfLibraryBooks() {
        assertEquals(cm.listBookCollection(), "HeadFirst Java by Kathy Sierra, Bert Bates, 2003");
    }

    @Test
    public void unavailableBooksNotListed() {
        cm.checkoutBook(b);
        assertEquals(cm.listBookCollection(), "");
    }

    @Test
    public void canCheckoutBooks() {
        assertEquals(cm.checkoutBook(b), "Thank you! Enjoy the book");
        assertEquals(b.getAvailability(), false);
    }

    @Test
    public void cannotCheckoutBooksNotInCollection() {
        Book hobbit = new Book("The Hobbit", "JRR Tolkein", 1937);
        assertEquals(cm.checkoutBook(hobbit), "That book is not available.");

    }

    @Test
    public void cannotCheckoutUnavailableBooks() {
        b.makeUnavailable();
        assertEquals(cm.checkoutBook(b), "That book is not available.");
    }

    @Test
    public void canReturnBooks() {
        cm.checkoutBook(b);
        assertEquals(b.getAvailability(), false);
        assertEquals(cm.returnBook(b), "Thank you for returning the book.");
        assertEquals(b.getAvailability(), true);
    }

    @Test
    public void cannotReturnAvailableBooks() {
        assertEquals(cm.returnBook(b), "That is not a valid book to return.");
    }

    @Test
    public void cannotReturnBooksNotInCollection() {
        Book hobbit = new Book("The Hobbit", "JRR Tolkein", 1937);
        assertEquals(cm.returnBook(hobbit), "That is not a valid book to return.");
    }


}