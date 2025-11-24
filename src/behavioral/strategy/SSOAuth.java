package behavioral.strategy;

public class SSOAuth implements Autheticator{
    @Override
    public void login() {
        System.out.println("SSO Auth");
    }
}
