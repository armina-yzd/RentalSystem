import java.util.ArrayList;

public class RentalStore {
    int id;
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Game> games = new ArrayList<>();
    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();

    public void register(Customer customer) {
        if (customers.contains(customer)) {
            System.out.println(" Such customer already exists.");
            return;
        }
        customers.add(customer);
    }

    public void addMovie(Movie movie) {
        if (movies.contains(movie)) {
            System.out.println(" Such movie already exists.");
            return;
        }
        movies.add(movie);
        items.add(movie);
    }

    public void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println(" Such movie already exists.");
            return;
        }
        books.add(book);
        items.add(book);

    }

    public void addGame(Game game) {
        if (games.contains(game)) {
            System.out.println(" Such movie already exists.");
            return;
        }
        games.add(game);
        items.add(game);

    }

    public void removeMovie(Movie movie) {

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).equals(movie)) {
                movies.remove(i);
                return;
            }
        }

        System.out.println("we don't have this movie");

    }

    public void rentItem(Item item, Customer customer) {
        int index = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                index = 0;
                break;
            }
        }
        if (index == -1) {
            System.out.println("sorry, we don't have this item");
            return;
        }
        if (item.isRentCondition() == false) {
            System.out.println("this item is not available");
        } else {
            item.setRentCondition(false);
            System.out.println("you rented this item");
            Rental rental = new Rental(item, customer);
        }

    }

    public void returnItem(Rental rental) {
        rental.getItem().setRentCondition(true);
        rental = null;
        System.out.println("you returned this book");

    }

    public Customer getCustomerById(int id) {

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                return customers.get(i);
            }
        }
        System.out.println("id not found");
        return null;

    }

    public Movie getMovieById(int id) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id) {
                return movies.get(i);
            }
        }
        System.out.println("id not found");
        return null;
    }
}
