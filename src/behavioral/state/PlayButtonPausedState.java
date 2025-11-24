package behavioral.state;

public class PlayButtonPausedState implements PlayButtonState {

    @Override
    public PlayButtonState nextState() {
        return new PlayButtonPlayingState();
    }

    @Override
    public void pressButton() {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }
}
