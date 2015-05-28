import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hannahwaxman on 28/05/15.
 */
public class BookTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void hasTitleAuthorYear() {
        Book b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        assertEquals(b.getTitle(), "HeadFirst Java");
        assertEquals(b.getAuthor(), "Kathy Sierra, Bert Bates");
        assertEquals(b.getYear(), 2003);
    }

    @Test
    public void isAvailableOnInitialization() {
        Book b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
        assertEquals(b.getAvailability(), true);
    }

}
