package creational.factory;

import java.util.*;
import java.util.function.Supplier;

public class VendingMachine {
    private static final Map<String, Supplier<Snack>> items = new HashMap<>();

    static {
        items.put("chips", Chips::new);
        items.put("chocobar", ChocoBar::new);
        items.put("drink", Drink::new);
    }

    Snack getSnack(String snackType) {
        if(items.containsKey(snackType))
        return items.get(snackType).get();

        throw new IllegalArgumentException("send in proper snack type");
    }


}
