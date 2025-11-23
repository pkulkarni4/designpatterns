package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class ItemOpExecutor {
    List<ItemOp> ops = new ArrayList<>();

    public void queueOp(ItemOp op) {
        ops.add(op);
    }

    public void checkout() {
        ops.forEach(ItemOp::execute);
        ops.clear();
    }
}
