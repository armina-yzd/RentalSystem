import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private int id;
    private ArrayList<Rental> rentals = new ArrayList<>();;

    public Customer(String name, String email, String phoneNumber, String address, int id) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }
}
