package creational.abstractfactory;

public class PurpleUIFactoryMaker implements FactoryMaker{
    @Override
    public Button createButton() {
        return new PurpleButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new PurpleScrollBar();
    }
}
