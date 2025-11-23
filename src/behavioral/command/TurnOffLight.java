package behavioral.command;

public class TurnOffLight implements ItemOp{
    private final Light light;

    public TurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOffLight();
    }
}
