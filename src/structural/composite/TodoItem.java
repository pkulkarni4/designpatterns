package structural.composite;

public class TodoItem implements Completable {
    private final String description;
    private boolean complete;

    public TodoItem(String description) {
        this.description = description;
    }

    public void markComplete() {
        this.complete = true;
    }

    @Override
    public boolean isComplete() {
        return this.complete;
    }
}
