package behavioral.visitor;

public class SeniorTicket implements TicketElement {

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public void accept(DiscountVisitor visitor) {
        visitor.visit(this);
    }
}
