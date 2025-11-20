package creational.builder;

public class StoreItem {
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    private StoreItem(ItemInventory itemInventory) {
        this.name = itemInventory.name;
        this.price = itemInventory.price;
        this.shortDescription = itemInventory.shortDescription;
        this.longDescription = itemInventory.longDescription;
        this.stockAvailable = itemInventory.stockAvailable;
        this.packagingType = itemInventory.packagingType;
        /*if (this.name == null || price == null) {
            throw new IllegalArgumentException("name and price cannot be null");
        }*/
    }

    @Override
    public String toString() {
        return "StoreItem {" +
                " name : " + this.name +
                ", price : " + this.price +
                ", shortDesc: " + this.shortDescription +
                ", longDesc: " + this.longDescription +
                ", stock available: " + this.stockAvailable +
                ", packaging type:" + this.packagingType +
                "}";
    }

    public static class ItemInventory{
        private final String name;
        private final Double price;
        private  String shortDescription;
        private  String longDescription;
        private  Integer stockAvailable;
        private  String packagingType;

        public ItemInventory(String name, Double price) {
            this.name = name;
            this.price = price;
            if (this.name == null || price == null) {
                throw new IllegalArgumentException("name and price cannot be null");
            }
        }

        public ItemInventory withShortDescription(String shortDescription){
            this.shortDescription = shortDescription;
            return this;
        }

        public ItemInventory withLongDescription(String longDescription) {
            this.longDescription = longDescription;
            return this;
        }

        public ItemInventory withStockAvailable(Integer stockAvailable){
            this.stockAvailable = stockAvailable;
            return this;
        }

        public ItemInventory withPackagingType(String packagingType){
            this.packagingType = packagingType;
            return this;
        }

        public StoreItem build() {
            return new StoreItem(this);
        }
    }
}
