import java.util.Date;

public class Book extends Item{
    private String author;
    private String publisher;
    private boolean avail;

    public Book(String title, String genre, String author, String publisher, Date releaseDate, int id){
        this.title=title;
        this.genre=genre;
        this.author=author;
        this.publisher=publisher;
        this.releaseDate=releaseDate;
        this.id=id;
        avail=true;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isAvail() {
        return avail;
    }
    public void setAvail(boolean avail) {
        this.avail = avail;
    }
}
