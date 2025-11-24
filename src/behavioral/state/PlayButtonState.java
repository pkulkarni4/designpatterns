package behavioral.state;

public interface PlayButtonState {
    void pressButton();

    PlayButtonState nextState();
}
