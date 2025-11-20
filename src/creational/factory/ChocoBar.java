package creational.factory;

public class ChocoBar implements Snack {
    @Override
    public int getPrice() {
        return 4;
    }

    @Override
    public String toString() {
        return "Chocobar { Price = " + this.getPrice() + "}";
    }
}
