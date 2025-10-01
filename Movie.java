public class Movie {

    private String title;
    private String rating;
    private int soldTickets;

    // Default constructor
    public Movie() {
        title = "";
        rating = "";
        soldTickets = 0;
    }

    // Copy constructor
    public Movie(Movie m) {
        title = m.title;
        rating = m.rating;
        soldTickets = m.soldTickets;
    }

    // Parameterized constructor
    public Movie(String title, String rating, int soldTickets) {
        this.title = title;
        this.rating = rating;
        this.soldTickets = soldTickets;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for rating
    public String getRating() {
        return rating;
    }

    // Setter for rating
    public void setRating(String rating) {
        this.rating = rating;
    }

    // Getter for soldTickets
    public int getSoldTickets() {
        return soldTickets;
    }

    // Setter for soldTickets
    public void setSoldTickets(int soldTickets) {
        this.soldTickets = soldTickets;
    }

    // toString method
    public String toString() {
        return (this.title + " (" + this.rating + "): Tickets Sold: " + this.soldTickets);
    }
}
