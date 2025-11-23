package behavioral.iterator;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        var pen = new Item("Pen", 20);
        var pencil = new Item("Pencil", 10);
        var eraser = new Item("Eraser", 2);
        var box = new Item("pencil box", 0);

        Inventory inv = new Inventory(pen, pencil, eraser, box);
        Iterator<Item> stockIterator = inv.iterator();
        while (stockIterator.hasNext()) {
            var item = stockIterator.next();
            if (item != null)
                System.out.println(item);
        }

        System.out.println();
        //

        Country ind = new Country("India");
        Country poland = new Country("Poland");
        Country nigeria = new Country("Nigeria");
        Country can = new Country("Canada");
        Country argentina = new Country("Argentina");


        World world = new World(ind, poland, nigeria, can, argentina);
        Iterator<Country> iter = world.iterator();

        while (iter.hasNext()) {
            Country country = iter.next();
            if (country != null) {
                System.out.println(country.getName());
            }
        }

    }
}
