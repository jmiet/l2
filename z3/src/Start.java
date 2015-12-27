import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by A on 2015-12-17.
 */
public class Start {

    public static void main(String[] args){

        TaskService taskServ = new TaskService();
        CategoryService catServ = new CategoryService();
        catServ.makeCat();
        taskServ.make();

        int choice;
        do{
        do {
            System.out.println("1 - dodaj zadanie,\n2 - pokaz kategorie" +
                                "\n3 - pokaz posortowane zadanie,\n4 - usun zadanie,\n5 - oznacz jako zrobione"
                                + "\n6 - pokaz niedokonczone, \n7 - zakoncz");
            Scanner read = new Scanner(System.in);
            choice = read.nextInt();
        } while ((choice < 1 || choice > 7));

        switch(choice){
            case 1:
                    System.out.println("\nPodaj nazwe zadania oraz kategorie");
                    Scanner read1 = new Scanner(System.in);
                    String name = read1.next();
                    String cat = read1.next();
                    Task zadanie = new Task(name, cat);
                    catServ.categoryCheck(zadanie.pass());
                    taskServ.add(zadanie);
                break;
            case 2:
                catServ.show();
                break;
            case 3:
                taskServ.showSorted();
                break;
            case 4:
                try {
                    System.out.println("\nKtore zadanie usunac? Podaj numer zadania");
                    int toRemove;
                    Scanner read2 = new Scanner(System.in);
                    toRemove = read2.nextInt();
                    taskServ.remove(toRemove - 1);
                } catch (InputMismatchException e){
                    System.out.println("Podano bledne dane");
                }
                break;
            case 5:
                try {
                    System.out.println("\nKtore zadanie oznaczyc jako zrobione? Podaj numer zadania");
                    Scanner read3 = new Scanner(System.in);
                    int index = read3.nextInt();
                    taskServ.done(index - 1);
                } catch (InputMismatchException e) {
                    System.out.println("Podano bledne dane");
                }
                break;
            case 6:
                taskServ.showUndone();

        }} while (choice!=7);

    }
    
}
