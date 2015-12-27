import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by A on 2015-12-17.
 */
public class TaskService {
    ArrayList<Task> tasks;
    ArrayList<Task> undone;


    void make(){
        tasks = new ArrayList<Task>();
        undone = new ArrayList<Task>();
    }

    void add(Task t){
        tasks.add(t);
        undone.add(t);
    }

    void showUndone(){
        for(Task t : undone)
            System.out.println(t);
    }

    void showSorted(){
        Collections.sort(tasks);
        for(Task t : tasks)
            System.out.println(t);
    }

    void remove(int index){
        try{
            tasks.remove(index);
        } catch (IndexOutOfBoundsException e){
        System.out.println("Nie moge usunac nieistniejacego elementu");}

    }

    void done(int index){
        try {
            undone.remove(index);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Ten element nie istnieje");
        }
    }

}
