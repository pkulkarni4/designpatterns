package behavioral.visitor;

public interface TicketVisitor {
    void visit(AdultTicket adultTicket);

    void visit(ChildTicket childTicket);

    void visit(SeniorTicket seniorTicket);

    void visit(GroupTicket groupTicket);
}
