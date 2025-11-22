package structural.proxy;

public class MoviePlayer implements MediaPlayer {
    public MoviePlayer() {
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading up large video..");
    }

    @Override
    public void play() {
        System.out.println("Playing video");
    }

}
