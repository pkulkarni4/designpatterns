package behavioral.memento;

public class DocumentViewer {
    public static void main(String[] args) {
        var textDoc = new TextDocument();
        textDoc.write("Hello, world!");
        textDoc.save();
        textDoc.print();
        textDoc.write("How are you?");
        textDoc.print();
        textDoc.undo();
        textDoc.print();
    }
}
