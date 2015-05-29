import org.junit.Before;
import org.junit.Test;
import sun.rmi.rmic.Main;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class BibliotecaAppTest {
    private CollectionManager cm;
    private BibliotecaApp biblioteca;
    private MainMenu menu;
    private Book headfirst;

    @Before
    public void setUp() throws Exception {
        biblioteca = new BibliotecaApp();
        menu = new MainMenu();
        cm = new CollectionManager();
        headfirst = new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003);
    }

//    @Test
//    public void printsWelcomeMessage() {
//        assertEquals(biblioteca.welcomeUser(), "Welcome to Biblioteca. The app is ready to use.");
//    }

}