package behavioral.strategy;

public class BankTransfer implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid by ACH");
    }
}
