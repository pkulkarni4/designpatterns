package behavioral.command;

public class RemoveItemFromBasket implements ItemOp{
    private Item item;

    public RemoveItemFromBasket(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        this.item.removeFromBasket();
    }
}
