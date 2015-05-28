import java.util.ArrayList;

public class CollectionManager {

    private ArrayList<Book> bookCollection = new ArrayList<>();

    public void addBook(Book book) {
        bookCollection.add(book);
    }

    public String listBookCollection() {

        String bookList = "";
        for (Book book : bookCollection) {
            if (book.isAvailable) {
                bookList += book.getTitle() + " ";
            }
        }
        return bookList;
    }

    public String checkoutBook(Book book) {
        if (bookCollection.contains(book) && book.isAvailable) {
            book.isAvailable = false;
            return "Thank you! Enjoy the book";
        } else {
            return "That book is not available.";
        }
    }

    public String returnBook(Book book) {
        if (bookCollection.contains(book) && !book.isAvailable ) {
            book.isAvailable = true;
            return "Thank you for returning the book.";
        } else {
            return "That is not a valid book to return.";
        }
    }
}
