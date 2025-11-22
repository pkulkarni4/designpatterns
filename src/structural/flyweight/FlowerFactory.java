package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {
    private final static Map<String, Flower> flowerCache = new HashMap<>();

    public static Flower createFlower(String name) {
        return flowerCache.computeIfAbsent(name, Flower::new);
    }
}
