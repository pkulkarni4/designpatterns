package structural.adapter;

public class EnglishMessage implements LocalizedMessage {
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}
