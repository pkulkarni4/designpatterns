package creational.singleton;

public class Cat {

    private final Logger logger =  Logger.getInstance();
    public void meow() {
        logger.log("meoow");
    }
}
