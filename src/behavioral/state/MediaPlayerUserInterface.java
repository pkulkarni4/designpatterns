package behavioral.state;

public class MediaPlayerUserInterface {

    private PlayButtonState state;

    public MediaPlayerUserInterface() {
        this.state = new PlayButtonPausedState();
    }

    public void pressButton() {
        state.pressButton();
        state = state.nextState();
    }

}
