package behavioral.visitor;

public interface Visitor {
    void visit(File file);
    void visit(Directory dir);
}
