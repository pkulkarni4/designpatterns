package behavioral.visitor;

public class DiscountVisitor implements TicketVisitor {
    private int totalPrice;

    @Override
    public void visit(AdultTicket adultTicket) {
        totalPrice += adultTicket.getPrice();
    }

    @Override
    public void visit(ChildTicket childTicket) {
        totalPrice += childTicket.getPrice();
    }

    @Override
    public void visit(SeniorTicket seniorTicket) {
        totalPrice += seniorTicket.getPrice();
    }

    @Override
    public void visit(GroupTicket groupTicket) {
        groupTicket.getElements().forEach(e -> e.accept(this));
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
