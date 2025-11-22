package structural.flyweight;

public class Flower {
    private String name;

    public Flower(String name) {
        this.name = name;
        System.out.println("Creating " + this.name + " object.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done creating " + this.name + " object.");
    }
}
