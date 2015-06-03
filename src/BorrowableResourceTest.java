import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BorrowableResourceTest {
    private Book headfirst;
    private Movie loveactually;

    @Before
    public void setUp() throws Exception {
        headfirst = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        loveactually = new Movie("Love Actually", "Richard Curtis", 2003, 7);

    }

    @Test
    public void hasTitleAuthorYear() {
        assertEquals(headfirst.getTitle(), "HeadFirst Java");
        assertEquals(headfirst.getAuthor(), "Kathy Sierra, Bert Bates");
        assertEquals(headfirst.getYear(), 2003);
    }

    @Test
    public void isAvailableOnInitialization() {
        assertEquals(loveactually.getAvailability(), true);
    }

    @Test
    public void canSetAvailability() {
        loveactually.makeUnavailable();
        assertEquals(loveactually.getAvailability(), false);
        loveactually.makeAvailable();
        assertEquals(loveactually.getAvailability(), true);
    }

}

