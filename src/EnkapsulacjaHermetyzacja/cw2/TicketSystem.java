package EnkapsulacjaHermetyzacja.cw2;

public class TicketSystem {

    public Ticket createTicket(MovieShow movieShow, Client client) {
        if (!movieShow.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (client.getAge() < movieShow.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat.");
            return null;
        } else {
            int ticketID = generateNextTicketId(movieShow);
            movieShow.decreaseFreeSeatsNumber();
            return new Ticket(ticketID, movieShow, client);
        }

    }

    private int generateNextTicketId(MovieShow movieShow) {
        return movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
    }


    private boolean clientHasRequiredAgeForMovie(Client client, MovieShow movieShow) {
        return client.getAge() >= movieShow.getAgeRequired();
    }

}