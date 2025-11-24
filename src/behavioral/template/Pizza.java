package behavioral.template;

public abstract class Pizza {

    public void makePizza() {
        makeBase();
        addToppings();
        cook();
    }

    void cook() {
        System.out.println("Cook in oven for 20 mins.");
    }

    abstract void addToppings() ;

    void makeBase() {
        System.out.println("Mix flour, yeast and salt.");
        System.out.println("Roll out the dough.");
    }

}
