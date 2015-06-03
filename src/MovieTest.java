import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    private Movie loveactually;

    @Before
    public void setUp() throws Exception {
        loveactually = new Movie("Love Actually", "Richard Curtis", 2003, 7);
    }

    @Test
    public void isConstructedWithTitleDirectorYearRating() {
        assertEquals(loveactually.getTitle(), "Love Actually");
        assertEquals(loveactually.getAuthor(), "Richard Curtis");
        assertEquals(loveactually.getYear(), 2003);
        assertEquals(loveactually.getRating(), 7);
    }

}