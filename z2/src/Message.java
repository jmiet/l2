/**
 * Created by A on 2015-12-15.
 */
import java.util.Scanner;
public class Message {
    String text;
    String prior;


    String set(){
        do {
            System.out.println("Jaki priorytet? URGENT, NORMAL, LOW?");
            Scanner read = new Scanner(System.in);
            prior = read.next();
        } while (!(prior.equals("URGENT")||prior.equals("NORMAL")||prior.equals("LOW")));
        return prior;
    }

    public String show(){
        return text;
    }

    Message(){
        set();
        System.out.println("Podaj tresc wiadomosci");
        Scanner read = new Scanner(System.in);
        text = read.next();
    }

}
