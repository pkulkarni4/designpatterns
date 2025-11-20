package creational.factory;

public class FactoryTest {
    public static void main(String[] args) {
        VendingMachine v = new VendingMachine();
        Snack c = v.getSnack("chips");
        System.out.println(c);
        Snack chocobar = v.getSnack("chocobar");
        System.out.println(chocobar);
        Snack drink = v.getSnack("drink");
        System.out.println(drink);

        Snack cig = v.getSnack("cig");
        System.out.println(cig);

    }
}
