package behavioral.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class NewsFeed implements PropertyChangeListener {
    private List<String> statusList = new ArrayList<>();

    public void printStatuses() {
        statusList.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        statusList.add((String) evt.getNewValue());
    }
}
