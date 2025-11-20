package creational.abstractfactory;

public class RedUIFactoryMaker implements FactoryMaker{
    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new RedScrollBar();
    }
}
