package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Checklist implements Completable {
    private List<TodoItem> todoItems = new ArrayList<>();

    public void addTodoItem(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

    @Override
    public boolean isComplete() {
        boolean complete = true;
        for (TodoItem todoItem : todoItems) {
            complete = complete && todoItem.isComplete();
        }

        return complete;
    }

}
