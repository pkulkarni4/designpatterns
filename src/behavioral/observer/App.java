package behavioral.observer;

public class App {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        NewsFeed feed = new NewsFeed();

        u1.addPropertyChangeListener(feed);
        u2.addPropertyChangeListener(feed);

        u1.setStatus("Going for a walk");
        u2.setStatus("Enjoying a cuppa tea");

        feed.printStatuses();

        System.out.println();

        Location l1 = new Location();
        Location l2 = new Location();
        WeatherUpdates updates = new WeatherUpdates();

        l1.addPropertyChangeListener(updates);
        l2.addPropertyChangeListener(updates);

        l1.setWeatherEvent("Risk of flooding");
        l2.setWeatherEvent("Risk of drought");

        updates.printWeatherUpdates();
    }
}
