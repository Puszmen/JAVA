package system;

import model.*;

class TicketSystem {
    Ticket createTicket(Client client, MovieShow movieShow) {
        if (movieShow.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (client.getAge() < movieShow.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = generateTicketId(movieShow);
            movieShow.decreaseFreeSeatsNumber();
            return new Ticket(ticketId, movieShow, client);
        }
    }
    private int generateTicketId (MovieShow movieShow) {
        return movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
    }
}