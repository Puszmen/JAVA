package model;
public class Ticket {
    private int ticketId;
    private MovieShow movie;
    private Client client;

    public Ticket(int ticketId, MovieShow movie, Client client) {
        this.ticketId = ticketId;
        this.movie = movie;
        this.client = client;
    }

    public String getInfo() {
        return ticketId +" "+ client.getFullName()+" | " + movie.getMovieInfo();
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public MovieShow getMovie() {
        return movie;
    }

    public void setMovie(MovieShow movie) {
        this.movie = movie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}