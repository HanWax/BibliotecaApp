public class Movie extends BorrowableResource {

    private int rating;

    public Movie(String title, String director, int year, int rating) {
        super(title, director, year);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
