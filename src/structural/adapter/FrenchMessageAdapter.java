package structural.adapter;

public class FrenchMessageAdapter implements LocalizedMessage {
    private final FrenchMessage frenchMessage;

    public FrenchMessageAdapter(FrenchMessage frenchMessage) {
        this.frenchMessage = frenchMessage;
    }

    @Override
    public void sayHello() {
        this.frenchMessage.sayBonjour();
    }
}
