package structural.proxy;

public class MusicPlayer {
    private static RecommendationProxy proxy = new RecommendationProxy();
    public static void main(String[] args) {
        User user = new User("Jill", false);
        loadHomePage(user);
        loadDiscoverPage(user);
    }

    private static void loadDiscoverPage(User user) {
        System.out.println("Loading discover page");
        //Recommendations recs = new SongRecommendations(user);
        proxy.showRecommendations(user);
    }

    private static void loadHomePage(User user) {
        System.out.println("Loading home page...");
        //Recommendations recs = new SongRecommendations(user);
        proxy.showRecommendations(user);
    }

}
