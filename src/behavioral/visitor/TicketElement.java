package behavioral.visitor;

public interface TicketElement {
    int getPrice();
    void accept(DiscountVisitor visitor);
}
