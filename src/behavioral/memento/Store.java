package behavioral.memento;

public class Store {
    public static void main(String[] args) {
        var item = new Item();
        item.setPrice(20);
        item.save();
        System.out.println("Item price is " + item.getPrice());
        item.setPrice(10);
        System.out.println("item price is " + item.getPrice());
        item.undo();
        System.out.println("item price after undo is " + item.getPrice());

    }
}
