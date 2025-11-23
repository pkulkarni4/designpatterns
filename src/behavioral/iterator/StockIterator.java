package behavioral.iterator;

import java.util.Iterator;

public class StockIterator implements Iterator<Item> {
    private Inventory inventory;
    private int index;

    public StockIterator(Inventory inventory) {
        this.inventory = inventory;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        var items = inventory.getItems();
        return this.index < items.length;
    }

    @Override
    public Item next() {
        var items = inventory.getItems();
        if (hasNext()) {
            Item next = items[this.index++];
            if (next.getQty() > 0) {
                return next;
            } else {
                return next();
            }
        }
        return null;
    }
}
