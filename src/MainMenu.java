import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    private ArrayList<String> menuOptions = new ArrayList<>();
    private int userChoice;
    private int menuSize;

    public void addOption(String option) {

        menuOptions.add(option);
        setMenuSize();
    }

    public String displayMenu() {
        String menu = "";

        for(String options : menuOptions) {
            menu += options + " ";
        }
        return menu;
    }

    public void setMenuSize() {
        menuSize = menuOptions.size();
    }

    public int getMenuSize() {
        return menuSize;
    }

    public void setUserChoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please select an option from the menu: ");
        userChoice = Integer.parseInt(input.next());
    }

    public int getUserChoice() {
        return userChoice;
    }

    public Boolean validMenuChoice() {
        return (userChoice <= menuSize);
    }

    public String invalidMenuChoice() {
        return "Select a valid option!";
    }

}
