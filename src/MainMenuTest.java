import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MainMenuTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void canAddOptionsToMenu() {
        MainMenu menu = new MainMenu();
        assertEquals(menu.displayMenu(), "");
        String option = "1. List Books";
        menu.addOption(option);
        assertEquals(menu.displayMenu(), "1. List Books ");
    }

    @Test
    public void listsMenuOptions() {
        MainMenu menu = new MainMenu();
        String option = "1. List Books";
        menu.addOption(option);
        assertEquals(menu.displayMenu(), "1. List Books ");
    }

    @Test
    public void getsUserChoice() {
        MainMenu menu = new MainMenu();
        menu.addOption("1. List Books");
        String userInput = "1";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        assertEquals(menu.getUserChoice(), "1");
    }

}