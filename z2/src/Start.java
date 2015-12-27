import java.util.Scanner;

/**
 * Created by A on 2015-12-15.
 */
public class Start {
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("1 - kolejka LIFO, 2 - kolejka FIFO");
            Scanner read = new Scanner(System.in);
            choice = read.nextInt();
        } while (!(choice == 1 || choice == 2));


        switch (choice) {
            case 1:
                LifoService service = new LifoService();
                service.lService();
                break;
            case 2:
                FifoService serviceF = new FifoService();
                serviceF.fService();
                break;

    }
}
}
