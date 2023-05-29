import java.time.LocalDate;
import java.util.Date;

public class Rental {
    private int id;
    private Movie movie;
    private Book book;
    private Game game;
    private Customer customer;
    Date rentalDate = new Date();
    Date returnDate = new Date();
    
    public Rental(Movie movie,Customer customer){
        this.movie=movie;
        this.customer=customer;
        LocalDate today = LocalDate.now();
        LocalDate returnday = today.plusDays(10);

        rentalDate = java.sql.Date.valueOf(today);
        returnDate =  java.sql.Date.valueOf(returnday);

    }
    
    public Rental(Book book,Customer customer){
        this.book=book;
        this.customer=customer;
        LocalDate today = LocalDate.now();
        LocalDate returnday = today.plusDays(10);

        rentalDate = java.sql.Date.valueOf(today);
        returnDate =  java.sql.Date.valueOf(returnday);

    }
    
    public Rental(Game game,Customer customer){
        this.game=game;
        this.customer=customer;
        LocalDate today = LocalDate.now();
        LocalDate returnday = today.plusDays(10);

        rentalDate = java.sql.Date.valueOf(today);
        returnDate =  java.sql.Date.valueOf(returnday);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    
    


}

