import java.util.Date;

public class Movie extends Item {

    private String director;
    private String cast;
    
    public Movie(String title, String genre, Date releaseDate, int id, double rentalFee, String director, String cast) {
        super(title, genre, releaseDate, id, rentalFee);
        this.director = director;
        this.cast = cast;
    }
    
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getCast() {
        return cast;
    }
    public void setCast(String cast) {
        this.cast = cast;
    }
    
   
}
