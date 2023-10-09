package EnkapsulacjaHermetyzacja.cw2;

public class Ticket {
    private int ticket1Id;
    private MovieShow movie;
    private Client client;

    public Ticket(int ticket1Id, MovieShow movie, Client client) {
        this.ticket1Id = ticket1Id;
        this.movie = movie;
        this.client = client;
    }

    public int getTicket1Id() {
        return ticket1Id;
    }

    public void setTicket1Id(int ticket1Id) {
        this.ticket1Id = ticket1Id;
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

    public String getInfo() {
        return ticket1Id + " | " + movie.getMovieInfo() + " | " + client.getFullName();
    }
}


