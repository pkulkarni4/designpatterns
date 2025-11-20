package creational.factory;

public class Chips implements Snack {
    public Chips() {
    }

    @Override
    public int getPrice() {
        return 1;
    }
    @Override
    public String toString() {
        return "Chips{ Price = "+ this.getPrice() + "}";
    }
}
