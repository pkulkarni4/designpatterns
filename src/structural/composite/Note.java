package structural.composite;

public class Note {
    private final char value;

    public Note(char value) {
        this.value = value;
    }

    public void play() {
        System.out.println(value);
    }

    @Override
    public String toString() {
        return "Note{" +
                "value=" + value +
                '}';
    }
}
