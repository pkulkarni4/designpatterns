package structural.flyweight;

public class Garden {
    public static void main(String[] args) {
        Flower sunflower1 = FlowerFactory.createFlower("Sunflower");
        Flower sunflower2 = FlowerFactory.createFlower("Sunflower");
        Flower sunflower3 = FlowerFactory.createFlower("Sunflower");
        System.out.println(sunflower1);
        System.out.println(sunflower2);
        System.out.println(sunflower3);
        Flower rose1 = FlowerFactory.createFlower("Rose");
        Flower rose2 = FlowerFactory.createFlower("Rose");
        Flower rose3 = FlowerFactory.createFlower("Rose");
        System.out.println(rose1);
        System.out.println(rose2);
        System.out.println(rose3);
    }
}
