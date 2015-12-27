import java.util.Scanner;

/**
 * Created by A on 2015-12-16.
 */
public class FifoService {
    Fifo queueFifo = new Fifo();
    int choice3;
    Message receivedF;

    void fService() {
        do {
            System.out.println("1 - wyslij, 2 - odbierz, 3 - wyjscie");
            Scanner read = new Scanner(System.in);
            choice3 = read.nextInt();
        } while (!(choice3 == 1 || choice3 == 2 || choice3 == 3));

        switch (choice3) {
            case 1:
                queueFifo.add(new Message());
                break;

            case 2:
                try {
                    receivedF = queueFifo.receive();
                    System.out.println(receivedF.show());
                    queueFifo.remove(receivedF);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Brak wiadomosci do odebrania");
                }
                break;
        }
                if (choice3 != 3) fService();
        }
    }


