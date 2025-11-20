package creational.builder;

public class ItemRegistry {
    public static void main(String[] args) {
        var item1 = new StoreItem.ItemInventory("pretzel", 2.0)
                .withShortDescription("A tasty snack")
                .withLongDescription("A tasty snack")
                .withStockAvailable(10)
                .withPackagingType("Bag")
                .build();

        var item2 = new StoreItem.ItemInventory("Soup", 3.0)
                .withShortDescription("A filling & healthy snack")
                .withLongDescription("A tasty snack")
                .withStockAvailable(10)
                .withPackagingType("Can").build();

        addToRegistry(item1);
        addToRegistry(item2);
    }

    private static void addToRegistry(StoreItem storeItem) {
        System.out.println("A new item was added: " + storeItem);
    }

}
