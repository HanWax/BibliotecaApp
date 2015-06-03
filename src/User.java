public class User {

    private String name;
    private String emailAddress;
    private String phoneNumber;
    private String libraryNumber;
    private String password;
    private Boolean loggedIn = false;


    public User(String name, String emailAddress, String phoneNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void login(String libraryNumber, String password) {
        setLibraryNumber(libraryNumber);
        setPassword(password);
        loggedIn = true;
    }

    public void logout() {
        loggedIn = false;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }

    public String accessUserInformation() {
        if (loggedIn) {
           return "Name: " + getName() + "\n" + "Email: " + getEmailAddress() + "\n" +  "Phone: " + getPhoneNumber();
        } else {
            return "Please login before continuing";
        }
    }
}
