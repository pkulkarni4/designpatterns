package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class GroupTicket implements TicketElement{
    private final List<TicketElement> elements = new ArrayList<>();

    @Override
    public int getPrice() {
        return 0;
    }

    public void addElement(TicketElement element) {
        elements.add(element);
    }

    public List<TicketElement> getElements() {
        return elements;
    }

    @Override
    public void accept(DiscountVisitor visitor) {
        visitor.visit(this);
    }
}
