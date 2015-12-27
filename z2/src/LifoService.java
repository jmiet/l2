import java.util.Scanner;

/**
 * Created by A on 2015-12-15.
 */
public class LifoService {
    Lifo queueLifo = new Lifo();
    int choice2;
    Message received;

    void lService() {
        do {
            System.out.println("1 - wyslij, 2 - odbierz, 3 - wyjscie");
            Scanner read = new Scanner(System.in);
            choice2 = read.nextInt();
        } while (!(choice2 == 1 || choice2 == 2 || choice2 == 3));

        switch (choice2) {
            case 1:
                queueLifo.add(new Message());
                break;

            case 2:
                try {
                    received = queueLifo.receive();
                    System.out.println(received.show());
                    queueLifo.remove(received);
                } catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Brak wiadomosci do odebrania");
                }
                break;
        }

        if (choice2 !=3) lService();
    }
}
