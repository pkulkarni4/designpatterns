package creational.abstractfactory;

public class BlueUIFactoryMaker implements FactoryMaker{
    @Override
    public Button createButton() {
        return new BlueButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new BlueScrollBar();
    }
}
