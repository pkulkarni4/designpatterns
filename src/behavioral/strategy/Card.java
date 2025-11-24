package behavioral.strategy;

public class Card implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid by card");
    }
}
