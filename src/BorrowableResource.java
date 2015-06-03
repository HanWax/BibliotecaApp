
abstract public class BorrowableResource {

    private String title;
    private String author;
    private int year;
    private Boolean isAvailable = true;
    private User borrowedBy;

    public BorrowableResource(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Boolean makeAvailable() {
        return isAvailable = true;
    }

    public Boolean makeUnavailable() {
        return isAvailable = false;
    }

    public Boolean getAvailability() {
        return isAvailable;
    }

    public void setBorrower(User user) {
        borrowedBy = user;
    }

    public User getBorrower() {return borrowedBy; }
}
