import java.util.ArrayList;

/**
 * Created by A on 2015-12-13.
 */
public class Lifo extends ArrayList<Message>
{

    public boolean add(Message o) {
        System.out.println("Wiadomosc wysylana");
        return super.add(o);
    }

    public Message receive() {
        int index = size() - 1;
        return get(index);
    }

}
