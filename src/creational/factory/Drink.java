package creational.factory;

public class Drink implements Snack {
    @Override
    public int getPrice() {
        return 2;
    }

    @Override
    public String toString() {
        return "Drink { Price = "+ this.getPrice() + "}";
    }
}
