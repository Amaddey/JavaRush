import java.util.ArrayList;
import java.util.List;

public class Note {
    public static final List<String> notes = new ArrayList<>();

    public static void addNote(String note){
        notes.add(0,note);
    }

    public static void removeNote(String threadName){
        String note = notes.remove(0);
        if(note == null){
            System.out.println("Другая нить удалила нашу заметку");
        }else if(!note.startsWith(threadName)){
            System.out.println("Нить [" + threadName + "] удалила чужую замтеку [" + note + "]");
        }
    }

    public static class NoteThread extends Thread {
        public NoteThread(){

        }

        @Override
        public void run() {
            int index = 1000;

            for (int i =0; i < index;i++){
                Note.addNote(getName() + "-Note" + i);
            }

            Note.removeNote(getName());
        }
    }
}
