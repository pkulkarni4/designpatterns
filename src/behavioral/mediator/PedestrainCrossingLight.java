package behavioral.mediator;

public class PedestrainCrossingLight {
    public enum Color {RED, GREEN};
    private Color color = Color.RED;

    public void changeToRed() {
        color = Color.RED;
        System.out.println("Pedestrain Crossing Light is RED");
    }

    public void changeToGreen() {
        color = Color.GREEN;
        System.out.println("Pedestrain Crossing Light is Green");
    }

}
