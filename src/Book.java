
public class Book {

    private String title;
    private String author;
    private int year;
    private Boolean isAvailable = true;

    Book(String title, String author, int year) {
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

    public Boolean getAvailability() {
        return isAvailable;
    }
}
