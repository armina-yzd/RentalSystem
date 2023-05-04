import java.util.Date;

public class Game extends Item{
    private String platform;
    private String publisher;
    private boolean avail;
    public Game(String title, String genre, String platform, String publisher, Date releaseDate, int id){
        this.title=title;
        this.genre=genre;
        this.platform=platform;
        this.publisher=publisher;
        this.releaseDate=releaseDate;
        this.id=id;
        avail=true;
    }
    public String getPlatform() {
        return platform;
    }
    public String getPublisher() {
        return publisher;
    }
    public boolean isAvail() {
        return avail;
    }
    public void setAvail(boolean avail) {
        this.avail = avail;
    }

}
