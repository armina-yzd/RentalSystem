import java.util.Date;

public class Movie extends Item {

    private String director;
    private String cast;
    private boolean available;
    public Movie(String title,String genre,String director,String cast,Date releaseDate,int id){
        this.title=title;
        this.genre=genre;
        this.director=director;
        this.cast=cast;
        this.releaseDate=releaseDate;
        this.id=id;
        available=true;
    }

    public String getDirector() {
        return director;
    }
    public String getCast() {
        return cast;
    }


    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
