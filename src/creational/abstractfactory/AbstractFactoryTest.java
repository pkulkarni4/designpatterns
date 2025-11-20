package creational.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        UserInterface redUI = createUI("RED");
        UserInterface blueUI = createUI("BLUE");
        UserInterface purpleUI = createUI("PURPLE");

        System.out.println("redUI:" + redUI);
        System.out.println("blueUI:" + blueUI);
        System.out.println("purpleUI:" + purpleUI);
    }

    static UserInterface createUI(String color) {

        var userInterfaceFactory = UIFactory.createFactory(color);
        var button = userInterfaceFactory.createButton();
        var scrollBar = userInterfaceFactory.createScrollBar();

        return new UserInterface(button, scrollBar);
    }

}
