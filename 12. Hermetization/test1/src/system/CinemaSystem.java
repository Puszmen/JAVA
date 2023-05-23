package system;

import model.Client;
import model.MovieShow;
import model.Ticket;

class CinemaSystem {
    public static void main(String[] args) {

        MovieShow movieShow = new MovieShow("Omen","horror",
                128,16,72,72);

        Client client1 = new Client("Jan","Kowalski",20);
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(client1, movieShow);

        Client client2 = new Client("Anna","Zalewska",19);
        Ticket ticket2 = ticketSystem.createTicket(client2, movieShow);


        System.out.println("Sprzedane bilety");
        if (ticket1 != null) {
            System.out.println(ticket1.getInfo());
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getInfo());
        }

        System.out.println("Liczba pozostałych miejsc: " + movieShow.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movieShow.numberSoldSeats()));
    }
}