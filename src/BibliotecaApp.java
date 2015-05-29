/**
 * Created by hannahwaxman on 29/05/15.
 */
public class BibliotecaApp {

    MainMenu menu = new MainMenu();
    CollectionManager cm = new CollectionManager();

    public void setUp () {
        menu.addOption("1. List Books ");
        menu.addOption("2. Quit ");
        cm.addBook(new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003));

    }

    public String welcomeUser() {
        return "Welcome to Biblioteca. The app is ready to use.";
    }

    public void choose(int choice) {
        switch(choice) {
            case 1 : cm.listBookCollection();
                break;
        }
    }

}
