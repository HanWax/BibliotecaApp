public class BibliotecaApp {
    MainMenu menu = new MainMenu();
    CollectionManager cm = new CollectionManager();

    public static void main (String[] args) {
        BibliotecaApp b = new BibliotecaApp();

        System.out.println(b.welcomeUser());
        b.setUp();
        b.activateMenu();
    }

    public void setUp() {
        menu.addOption("1. List Books ");
        menu.addOption("2. Quit ");
        cm.addBook(new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003));
    }

    public String welcomeUser() {
        return "Welcome to Biblioteca. The app is ready to use.";
    }

    public void choose(int choice) {
        if (choice == 1) {
            System.out.println(cm.listBookCollection());
            activateMenu();
        } else if (choice == 2) {
            System.out.println("You have quit the menu");
        }

    }

    public void activateMenu() {
        System.out.println(menu.displayMenu());
        menu.setUserChoice();
        if (menu.validMenuChoice()) {
            choose(menu.getUserChoice());
        }
        else {
            System.out.println(menu.invalidMenuChoice());
            activateMenu();
        }

    }

}
