public class BibliotecaApp {
    MainMenu menu = new MainMenu();
    CollectionManager bookCollection = new CollectionManager();
    CollectionManager movieCollection = new CollectionManager();

    public static void main (String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();

        System.out.println(biblioteca.welcomeUser());
        biblioteca.setUp();
        biblioteca.activateMenu();
    }

    public void setUp() {
        menu.addOption("1. List Books ");
        menu.addOption("2. List Movies ");
        menu.addOption("3. Quit ");
        bookCollection.addResource(new Book("HeadFirst Java", "Kathy Sierra, Bert Bates", 2003));
        movieCollection.addResource(new Movie("Far from the Madding Crowd", "Thomas Vinterberg", 2015, 9));
    }

    public String welcomeUser() {
        return "Welcome to Biblioteca. The app is ready to use.";
    }

    public void choose(int choice) {
        if (choice == 1) {
            System.out.println(bookCollection.listResourceCollection());
            activateMenu();
        } else if (choice == 2) {
            System.out.println(movieCollection.listResourceCollection());
            activateMenu();
        } else if (choice == 3) {
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
