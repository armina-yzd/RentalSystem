import java.util.Date;

public class Item {
    String title;
    String genre;
    Date releaseDate = new Date();
    int id;
    double rentalFee;
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
}
