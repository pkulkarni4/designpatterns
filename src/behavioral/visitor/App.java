package behavioral.visitor;

public class App {
    public static void main(String[] args) {
        Directory d1 = new Directory("d1");
        File f1 = new File("f1.txt", 100);
        File f11 = new File("f11.txt", 100);
        d1.addElement(f1);
        d1.addElement(f11);

        Directory d2 = new Directory("d2");
        File f2 = new File("f2.txt", 200);
        d2.addElement(f2);

        d1.addElement(d2);

        var visitor = new CalculateSize();
        d1.accept(visitor);

        System.out.println("total size: " + visitor.getTotalSize());

        System.out.println();

        var grpTicket = new GroupTicket();
        var t1 = new AdultTicket();
        var t2 = new AdultTicket();
        var c1 = new ChildTicket();
        var c2 = new ChildTicket();
        var s1 = new SeniorTicket();
        var s2 = new SeniorTicket();

        grpTicket.addElement(t1);
        grpTicket.addElement(t2);
        grpTicket.addElement(c1);
        grpTicket.addElement(c2);
        grpTicket.addElement(s1);
        grpTicket.addElement(s2);

        var ticketVisitor = new DiscountVisitor();
        grpTicket.accept(ticketVisitor);
        System.out.println("total price: " + ticketVisitor.getTotalPrice());

    }
}
