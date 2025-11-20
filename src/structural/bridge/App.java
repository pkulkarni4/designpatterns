package structural.bridge;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle(new Red());
        circle.getType();
        circle.getColor().get();

        Shape square = new Square(new Blue());
        square.getType();
        square.getColor().get();
    }
}
