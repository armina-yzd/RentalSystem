import java.time.LocalDate;
import java.util.Date;

public class Rental {
    private int id;
    private Movie rentedMovie;
    private Customer customer;
    Date rentalDate = new Date();
    Date returnDate = new Date();
    public Rental(Movie movie,Customer customer,int id){
        this.id=id;
        rentedMovie=movie;
        this.customer=customer;
        LocalDate today = LocalDate.now();
        LocalDate returnday = today.plusDays(10);

        rentalDate = java.sql.Date.valueOf(today);
        returnDate =  java.sql.Date.valueOf(returnday);

    }

    public int getId() {
        return id;
    }
    public Movie getRentedMovie() {
        return rentedMovie;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Date getRentalDate() {
        return rentalDate;
    }
    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    public double calculateLateFee(){

        return 0;
    }

}

