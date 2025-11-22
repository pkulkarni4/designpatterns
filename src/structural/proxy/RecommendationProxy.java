package structural.proxy;

public class RecommendationProxy implements Recommendations{
    private Recommendations recommendations;

    @Override
    public void showRecommendations(User user) {
        if(!user.isPremium()) {
            System.out.println("upgrade to see recs");
            return;
        }

        if(recommendations == null) {
            recommendations = new SongRecommendations(user);
        }
        recommendations.showRecommendations(user);
    }
}
