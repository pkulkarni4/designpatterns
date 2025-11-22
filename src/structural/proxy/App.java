package structural.proxy;

public class App {
    private static final MediaPlayerProxy proxy = new MediaPlayerProxy();

    public static void main(String[] args) {
        gotoMovieLib();
        gotoFavMovies();
    }

    private static void gotoFavMovies() {
        System.out.println("Loading fav movies...");
        //MoviePlayer moviePlayer = new MoviePlayer();
        proxy.play();
    }

    private static void gotoMovieLib() {
        System.out.println("Loading library...");
        //MoviePlayer moviePlayer = new MoviePlayer();
        proxy.play();
    }
}
