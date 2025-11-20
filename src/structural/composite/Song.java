package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Song implements Playable{
    List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    @Override
    public void play() {
        this.getNotes().forEach(Note::play);
    }
}
