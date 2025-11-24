package behavioral.memento;

public class TextDocumentState {
    private String state;

    public TextDocumentState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
