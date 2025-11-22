package structural.proxy;

public class SongRecommendations implements Recommendations{

    @Override
    public void showRecommendations(User user) {
        System.out.println("Showing song recs for " + user.getName() +" based on their top tracks, artists and genres");
    }

    public SongRecommendations(User user) {
        getData(user);
    }

    private void getData(User user) {
        System.out.println("getting " + user.getName() + "'s top tracks");
        System.out.println("getting " + user.getName() + "'s top artists");
        System.out.println("getting " + user.getName() + "'s top genres");
    }
}
