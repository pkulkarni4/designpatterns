package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Assignee {
    private List<Ticket> tickets = new ArrayList<>();

    public void pickUpTicket(Ticket ticket) {
        System.out.println("Ticket picked up by assignee");
        tickets.add(ticket);
    }

    public void resolveTicket(Ticket ticket) {
        tickets.remove(ticket);
        System.out.println("Ticket resolved");
    }
}
