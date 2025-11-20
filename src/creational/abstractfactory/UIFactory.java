package creational.abstractfactory;

import java.util.*;
import java.util.function.Supplier;

public class UIFactory {
    private static final Map<String, Supplier<FactoryMaker>> userInterfaceFactories = new HashMap<>();

    static {
        userInterfaceFactories.put("BLUE", BlueUIFactoryMaker::new);
        userInterfaceFactories.put("RED", RedUIFactoryMaker::new);
        userInterfaceFactories.put("PURPLE", PurpleUIFactoryMaker::new);
    }

    public static FactoryMaker createFactory(String color) {
        if(userInterfaceFactories.containsKey(color)){
            return userInterfaceFactories.get(color).get();
        }
        throw new IllegalArgumentException("color not supported");
    }
}
