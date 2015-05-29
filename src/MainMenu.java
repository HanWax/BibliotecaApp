import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    private ArrayList<String> menuOptions = new ArrayList<>();
    private String userChoice;

    public void addOption(String option) {
        menuOptions.add(option);
    }

    public String displayMenu() {
        String menu = "";

        for(String options : menuOptions) {
            menu += options + " ";
        }
        return menu;
    }

    public String getUserChoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please select an option from the menu: ");
        userChoice = input.next();
        return userChoice;
    }

}
