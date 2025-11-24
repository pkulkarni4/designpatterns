package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Ticket> inProgressTickets = new ArrayList<>();
    private List<Ticket> doneTickets = new ArrayList<>();

    public List<Ticket> getDoneTickets() {
        return this.doneTickets;
    }

    public void addTicketToInProgressTickets(Ticket ticket) {
        inProgressTickets.add(ticket);
      //  ticket.setStatus(Ticket.Status.IN_PROGRESS);
        System.out.println("Ticket added to in progress ticket list");
    }

    public void addTicketToDoneTickets(Ticket ticket) {
        doneTickets.add(ticket);
        //ticket.setStatus(Ticket.Status.DONE);
        System.out.println("Ticket added to done ticket list");
        inProgressTickets.remove(ticket);
        System.out.println("Ticket removed from in progress list");
    }

}
