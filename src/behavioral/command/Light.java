package behavioral.command;

public class Light {
    private boolean on;

    public void turnOnLight() {
        this.on = true;
        print();
    }

    public void turnOffLight() {
        this.on = false;
        print();
    }

    public void print() {
        System.out.println("Light is " + (this.on ? "on" : "off") +".");
    }
}
