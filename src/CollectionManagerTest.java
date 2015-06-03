import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CollectionManagerTest {

    private CollectionManager bookCollection;
    private Book b;
    private User hannah;

    public void login() {
        hannah.login("333-3333", "super secret password");
    }

    @Before
    public void setUp() throws Exception {
        bookCollection = new CollectionManager();
        b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        bookCollection.addResource(b);
        hannah = new User("Hannah", "hannah@example.com", "07777777777");
    }

    @Test
    public void hasListOfLibraryBooks() {
        assertEquals(bookCollection.listResourceCollection(), "HeadFirst Java by Kathy Sierra, Bert Bates, 2003");
    }

    @Test
    public void unavailableBooksNotListed() {
        login();
        bookCollection.checkoutResource(b, hannah);
        assertEquals(bookCollection.listResourceCollection(), "");
    }

    @Test
    public void canCheckoutBooksIfLoggedIn() {
        login();
        assertEquals(bookCollection.checkoutResource(b, hannah), "Thank you! Enjoy the resource");
        assertEquals(b.getAvailability(), false);
    }

    @Test
    public void cannotCheckoutBooksIfLoggedOut() {
        assertEquals(bookCollection.checkoutResource(b, hannah), "That resource is not available.");
    }

    @Test
    public void cannotCheckoutBooksNotInCollection() {
        Book hobbit = new Book("The Hobbit", "JRR Tolkein", 1937);
        assertEquals(bookCollection.checkoutResource(hobbit, hannah), "That resource is not available.");

    }

    @Test
    public void cannotCheckoutUnavailableBooks() {
        b.makeUnavailable();
        assertEquals(bookCollection.checkoutResource(b, hannah), "That resource is not available.");
    }

    @Test
    public void canReturnBooksIfLoggedIn() {
        login();
        bookCollection.checkoutResource(b, hannah);
        assertEquals(b.getAvailability(), false);
        assertEquals(bookCollection.returnResource(b, hannah), "Thank you for returning the resource.");
        assertEquals(b.getAvailability(), true);
    }

    @Test
    public void cannotReturnAvailableBooks() {
        assertEquals(bookCollection.returnResource(b, hannah), "That is not a valid resource to return.");
    }

    @Test
    public void cannotReturnUnavailableBooksIfLoggedOut() {
        login();
        bookCollection.checkoutResource(b, hannah);
        assertEquals(b.getAvailability(), false);
        hannah.logout();
        assertEquals(bookCollection.returnResource(b, hannah), "That is not a valid resource to return.");
    }

    @Test
    public void cannotReturnBooksNotInCollection() {
        Book hobbit = new Book("The Hobbit", "JRR Tolkein", 1937);
        assertEquals(bookCollection.returnResource(hobbit, hannah), "That is not a valid resource to return.");
    }


}