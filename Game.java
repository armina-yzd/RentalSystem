import java.util.Date;

public class Game extends Item {
    private String platform;
    private String publisher;

    public Game(String title, String genre, Date releaseDate, int id, double rentalFee, String platform,
            String publisher) {
        super(title, genre, releaseDate, id, rentalFee);
        this.platform = platform;
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
