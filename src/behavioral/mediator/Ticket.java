package behavioral.mediator;

public class Ticket {
    private Assignee assignee;
    public enum Status {SUBMITTED, IN_PROGRESS, DONE}
    private Status status;

    public Ticket() {
        this.status = Status.SUBMITTED;
    }

    public Status getStatus() {
        return status;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;

    }

    public void setStatus(Status status) {
        this.status = status;
        System.out.println("status is changed to: " + status);
    }
}
