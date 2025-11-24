package behavioral.mediator;

public class App {
    public static void main(String[] args) {
        var board = new Board();
        var ticket = new Ticket();
        var assignee = new Assignee();

        // assignee.pickUpTicket(ticket);
        // System.out.println();
        // assignee.resolveTicket(ticket);

        var mediator = new Mediator(ticket, assignee, board);
        mediator.pickUpTicket();
        System.out.println();
        mediator.resolveTicket();

        System.out.println();
        //

        var trafficLight = new TrafficLight();
        var walkLight = new PedestrainCrossingLight();

        /*
        Traffic light is AMBER
Traffic light is GREEN
Pedestrain Crossing Light is RED
Traffic light is AMBER
Traffic light is RED
Pedestrain Crossing Light is Green

        trafficLight.changeToAmber();
        trafficLight.changeToGreen();
        trafficLight.changeToAmber();
        trafficLight.changeToRed();
*/
        TrafficLightMediator trafficLightMediator = new TrafficLightMediator(trafficLight, walkLight);
        trafficLightMediator.changeTrafficLightToAmber();
        trafficLightMediator.changeTrafficLightToGreen();
        trafficLightMediator.changeTrafficLightToAmber();
        trafficLightMediator.changeTrafficLightToRed();

    }
}
