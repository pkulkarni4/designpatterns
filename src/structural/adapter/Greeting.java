package structural.adapter;

public class Greeting implements GreetingInt {
    private final LocalizedMessage localizedMessage;

    public Greeting(LocalizedMessage localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    @Override
    public void print(){
        localizedMessage.sayHello();
    }
}
