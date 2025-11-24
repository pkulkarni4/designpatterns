package behavioral.mediator;

public class TrafficLightMediator {
    private TrafficLight trafficLight;
    private PedestrainCrossingLight walkLight;

    public TrafficLightMediator(TrafficLight trafficLight, PedestrainCrossingLight walkLight) {
        this.trafficLight = trafficLight;
        this.walkLight = walkLight;
    }

    public void changeTrafficLightToAmber() {
        this.trafficLight.changeToAmber();
    }

    public void changeTrafficLightToRed() {
        trafficLight.changeToRed();
        walkLight.changeToGreen();
    }

    public void changeTrafficLightToGreen() {
        walkLight.changeToRed();
        trafficLight.changeToGreen();

    }
}
