import java.util.ArrayList;

public class RentalStore {
    int id;
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    public void register(Customer customer){
        if (customers.contains(customer)) {
            System.out.println(" Such customer already exists.");
            return;
        }
        customers.add(customer);
    }
    public void addMovie(Movie movie){
        if (movies.contains(movie)) {
            System.out.println(" Such movie already exists.");
            return;
        }
        movies.add(movie);
    }
    public void removeMovie(Movie movie){
        int index=-1;
        for(int i=0;i< movies.size();i++){
            if(movies.get(i).equals(movie)){
                movies.remove(i);
                index=0;
                break;
            }
        }
        if(index==-1){
            System.out.println("we don't have this movie");
        }
    }
    public ArrayList<Movie> getAvailableMovies(){
        return movies;
    }
    // public void rentMovie(Movie movie,Customer customer){
    //     int index = -1;
    //     for(int i=0;i< movies.size();i++){
    //         if(movies.get(i).equals(movie)){
    //             index=0;
    //             break;
    //         }
    //     }
    //     if(index==-1){
    //         System.out.println("sorry, we don't have this movie");
    //         return;
    //     }
    //     if(movie.isAvailable()==false){
    //         System.out.println("this movie is not available");
    //     }else {
    //         movie.setAvailable(false);
    //         System.out.println("you rented this movie");
    //     }

    // }
    // public void returnMovie(Rental rental){


    // }
   public Customer getCustomerById(int id){

       for(int i=0;i<customers.size();i++){
           if(customers.get(i).getId()==id){
               return customers.get(i);
           }
       }
       System.out.println("id not found");
       return null;

   }
   public Movie getMovieById(int id){
       for(int i=0;i<movies.size();i++){
           if(movies.get(i).getId()==id){
               return movies.get(i);
           }
       }
      System.out.println("id not found");
      return null;
   }
}
