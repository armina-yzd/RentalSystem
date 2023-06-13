import java.time.LocalDate;
import java.util.Date;

public class Rental {
    private int id;
    private Item item;
    private Customer customer;
    Date rentalDate = new Date();
    Date returnDate = new Date();

    public Rental(Item item, Customer customer) {
        this.item = item;
        this.customer = customer;
        LocalDate today = LocalDate.now();
        LocalDate returnday = today.plusDays(10);

        rentalDate = java.sql.Date.valueOf(today);
        returnDate = java.sql.Date.valueOf(returnday);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
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
