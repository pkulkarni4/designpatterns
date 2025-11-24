package behavioral.template;

public abstract class NotificationTemplate {

    public void sendEmailNotification() {
        sendGreeting();
        sendMessageBody();
        sendClosing();
    }

    public void sendGreeting() {
        System.out.println("Hello");
    }

    abstract void sendMessageBody();

    public void sendClosing() {
        System.out.println("Best Regards, Sam");
    }
}
