package structural.composite;

public class App {
    public static void main(String[] args) {
        Checklist checklist = new Checklist();
        TodoItem todoItem1 = new TodoItem("Do this");
        TodoItem todoItem2 = new TodoItem("Do that");
        TodoItem todoItem3 = new TodoItem("Do something else");

        checklist.addTodoItem(todoItem1);
        checklist.addTodoItem(todoItem2);
        checklist.addTodoItem(todoItem3);

        todoItem1.markComplete();
        todoItem2.markComplete();
        todoItem3.markComplete();

        System.out.println(checklist.isComplete());
        //
        Note a = new Note('A');
        Note b = new Note('B');
        Note c = new Note('C');
        Note d = new Note('D');

        Song song = new Song();
        song.addNote(a);
        song.addNote(b);
        song.addNote(c);
        song.addNote(d);

        // instead of playing individual note, play a song
       // song.getNotes().forEach(Note::play);
        song.play();
    }
}
