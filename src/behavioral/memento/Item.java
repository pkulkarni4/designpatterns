package behavioral.memento;

public class Item {
    private int price;
    private ItemPriceState itemPriceState = new ItemPriceState(price);

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void save() {
        itemPriceState.setState(price);
    }

    public void undo() {
        price = itemPriceState.getState();
    }
}
