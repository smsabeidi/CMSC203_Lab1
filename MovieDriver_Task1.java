import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Create a new Movie object
        Movie movie = new Movie();

        // Prompt for movie title
        System.out.print("Enter the title of the movie: ");
        String title = keyboard.nextLine();
        movie.setTitle(title);

        // Prompt for movie rating
        System.out.print("Enter the movie's rating: ");
        String rating = keyboard.nextLine();
        movie.setRating(rating);

        // Prompt for number of tickets sold
        System.out.print("Enter the number of tickets sold: ");
        int tickets = keyboard.nextInt();
        movie.setSoldTickets(tickets);

        // Print movie information
        System.out.println("\nMovie Information:");
        System.out.println(movie.toString());

        keyboard.close();
    }
}
