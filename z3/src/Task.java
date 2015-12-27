import java.util.ArrayList;

/**
 * Created by A on 2015-12-17.
 */
public class Task implements Comparable<Task> {

    String toDo;
    public String category;


    Task(String toDo, String category){
        this.toDo = toDo;
        this.category = category;
        System.out.println("utworzono zadanie");
    }

    String pass() { return category; }

    @Override
    public String toString() {
        return "Zadanie: " + toDo+", z kategorii " + category;
    }

    @Override
    public int compareTo(Task t) {
        int compared = category.compareTo(t.category);
        return compared;
    }
}
