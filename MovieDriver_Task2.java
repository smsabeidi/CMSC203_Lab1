import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String continueInput;

        do {
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

            // Clear the buffer
            keyboard.nextLine(); // consumes leftover newline

            // Print movie information
            System.out.println("\nMovie Information:");
            System.out.println(movie.toString());

            // Ask if user wants to continue
            System.out.print("\nDo you want to enter another movie? (yes/no): ");
            continueInput = keyboard.nextLine().trim().toLowerCase();

        } while (continueInput.equals("yes"));

        System.out.println("Thank you for using the Movie Driver!");
        keyboard.close();
    }
}
