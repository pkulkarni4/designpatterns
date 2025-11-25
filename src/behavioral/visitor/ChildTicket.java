package behavioral.visitor;

public class ChildTicket implements TicketElement {

    @Override
    public int getPrice() {
        return 6;
    }

    @Override
    public void accept(DiscountVisitor visitor) {
        visitor.visit(this);
    }
}
