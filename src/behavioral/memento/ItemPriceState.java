package behavioral.memento;

public class ItemPriceState {
    private int state;

    public ItemPriceState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
