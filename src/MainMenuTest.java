import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MainMenuTest {
    private MainMenu menu;

    @Before
    public void setUp() throws Exception {
        menu = new MainMenu();
        menu.addOption("1. List Books");
        String userInput = "1";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
    }

    @Test
    public void canAddOptionsToMenu() {
        assertEquals(menu.getMenuSize(), 1);
        menu.addOption("2. Quit");
        assertEquals(menu.getMenuSize(), 2);
    }

    @Test
    public void displaysMenuOptions() {
        assertEquals(menu.displayMenu(), "1. List Books ");
    }

    @Test
    public void setsUserChoice() {
        assertEquals(menu.getUserChoice(), 0);
        menu.setUserChoice();
        assertEquals(menu.getUserChoice(), 1);
    }

    @Test
    public void validChoiceIfWithinMenuBounds() {
        menu.setUserChoice();
        assertEquals(menu.validMenuChoice(), true);
    }

    @Test
    public void invalidChoiceIfOutOfMenuBounds() {
        String userInput = "2";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        menu.setUserChoice();
        assertEquals(menu.validMenuChoice(), false);
    }


}