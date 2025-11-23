package behavioral.command;

public class AddItemToBasket implements ItemOp {
    private final Item item;

    public AddItemToBasket(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        this.item.addToBasket();
    }
}
