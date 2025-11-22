package structural.flyweight;

public class Restaurant {
    public static void main(String[] args) {
        Order pizza1 = OrderFactory.createOrder("Pizza");
        Order pizza2 = OrderFactory.createOrder("Pizza");
        Order pizza3 = OrderFactory.createOrder("Pizza");

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        Order burger1 = OrderFactory.createOrder("Burger");
        Order burger2 = OrderFactory.createOrder("Burger");
        Order burger3 = OrderFactory.createOrder("Burger");

        System.out.println(burger1);
        System.out.println(burger2);
        System.out.println(burger3);
    }
}
