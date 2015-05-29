import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private Book b;

    @Before
    public void setUp() throws Exception {
        b = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
    }

    @Test
    public void hasTitleAuthorYear() {
        assertEquals(b.getTitle(), "HeadFirst Java");
        assertEquals(b.getAuthor(), "Kathy Sierra, Bert Bates");
        assertEquals(b.getYear(), 2003);
    }

    @Test
    public void isAvailableOnInitialization() {
        assertEquals(b.getAvailability(), true);
    }

}
