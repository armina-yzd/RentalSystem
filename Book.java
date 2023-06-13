import java.util.Date;

public class Book extends Item {
    private String author;
    private String publisher;

    public Book(String title, String genre, Date releaseDate, int id, double rentalFee, String author,
            String publisher) {
        super(title, genre, releaseDate, id, rentalFee);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
