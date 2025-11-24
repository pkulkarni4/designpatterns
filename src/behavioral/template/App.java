package behavioral.template;

public class App {
    public static void main(String[] args) {
        var welcomeEmail = new WelcomeEmail();
        welcomeEmail.sendEmailNotification();
        System.out.println();
        var unsubEmail = new UnsubscribeEmail();
        unsubEmail.sendEmailNotification();
        //
        System.out.println();

        Pizza vegPizza = new VegPizza();
        vegPizza.makePizza();

        System.out.println();
        var meatPizza = new MeatPizza();
        meatPizza.makePizza();
    }
}
