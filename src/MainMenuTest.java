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
    }

    @Test
    public void canAddOptionsToMenu() {
        menu.setMenuSize();
        assertEquals(menu.getMenuSize(), 0);
        menu.addOption("1. List Books");
        menu.setMenuSize();
        assertEquals(menu.getMenuSize(), 1);
    }

    @Test
    public void listsMenuOptions() {
        menu.addOption("1. List Books");
        assertEquals(menu.displayMenu(), "1. List Books ");
    }

    @Test
    public void setsUserChoice() {
        menu.addOption("1. List Books");
        String userInput = "1";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        assertEquals(menu.getUserChoice(), 0);
        menu.setUserChoice();
        assertEquals(menu.getUserChoice(), 1);
    }

    @Test
    public void validChoiceIfWithinMenuBounds() {
        menu.addOption("1. List Books");
        menu.setMenuSize();
        String userInput = "1";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        menu.setUserChoice();
        assertEquals(menu.validMenuChoice(), true);
    }

    @Test
    public void invalidChoiceIfOutOfMenuBounds() {
        menu.addOption("1. List Books");
        menu.setMenuSize();
        String userInput = "2";
        System.setIn(new ByteArrayInputStream(userInput.getBytes()));
        menu.setUserChoice();
        assertEquals(menu.validMenuChoice(), false);
    }


}