package behavioral.command;

public class App {
    public static void main(String[] args) {
        Light light = new Light();
        //
        TurnOnLight turnOnLight = new TurnOnLight(light);
        turnOnLight.execute();
        TurnOffLight turnOffLight = new TurnOffLight(light);
        turnOffLight.execute();

    }
}
