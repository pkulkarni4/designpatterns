package behavioral.state;

public class PlayButtonPlayingState implements PlayButtonState {

    @Override
    public PlayButtonState nextState() {
        return new PlayButtonPausedState();
    }

    @Override
    public void pressButton() {
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }
}
