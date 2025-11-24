package behavioral.strategy;

public class BasicAuth implements Autheticator {
    @Override
    public void login() {
        System.out.println("logging using basic auth");
    }
}
