package behavioral.command;

public class TurnOnLight implements ItemOp {
    private final Light light;

    public TurnOnLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOnLight();
    }
}
