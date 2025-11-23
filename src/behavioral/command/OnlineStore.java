package behavioral.command;

public class OnlineStore {
    public static void main(String[] args) {
        var item1 = new Item(1);
        var item2 = new Item(2);
        var item3 = new Item(3);
        var item4 = new Item(4);

        ItemOpExecutor itemOpExecutor = new ItemOpExecutor();
        itemOpExecutor.queueOp(new AddItemToBasket(item1));
        itemOpExecutor.queueOp(new AddItemToBasket(item2));
        itemOpExecutor.queueOp(new AddItemToBasket(item3));
        itemOpExecutor.queueOp(new RemoveItemFromBasket(item1));

        itemOpExecutor.checkout();
    }
}
