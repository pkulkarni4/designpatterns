package behavioral.strategy;

public class App {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.loginUser(new BasicAuth());
        loginPage.loginUser(new SSOAuth());

        //
        System.out.println();

        CheckoutPage cp = new CheckoutPage();
        cp.pay(new BankTransfer());
        cp.pay(new Card());
    }
}
