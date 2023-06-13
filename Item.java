import java.util.Date;

public class Item {
    private String title;
    private String genre;
    private Date releaseDate = new Date();
    private int id;
    private double rentalFee;
    private boolean RentCondition = true;

    public Item(String title, String genre, Date releaseDate, int id, double rentalFee) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.id = id;
        this.rentalFee = rentalFee;
    }

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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public boolean isRentCondition() {
        return RentCondition;
    }

    public void setRentCondition(boolean rentCondition) {
        RentCondition = rentCondition;
    }

}
