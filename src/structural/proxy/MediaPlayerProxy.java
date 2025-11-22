package structural.proxy;

public class MediaPlayerProxy implements MediaPlayer {
    private MoviePlayer moviePlayer;

    @Override
    public void play() {
        if (moviePlayer == null) {
            moviePlayer = new MoviePlayer();
        }
        moviePlayer.play();
    }
}
