import java.util.ArrayList;

/**
 * Created by A on 2015-12-15.
 */
public class Fifo extends ArrayList<Message> {

    public boolean add(Message o) {
        System.out.println("Wiadomosc wysylana");
        return super.add(o);
    }

    public Message receive() {
        int index = 0;
        return get(index);
    }
}
