/**
 * Created by hannahwaxman on 28/05/15.
 */
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
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public Boolean getAvailability() {
        return this.isAvailable;
    }
}
