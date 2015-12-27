import java.util.ArrayList;

/**
 * Created by A on 2015-12-17.
 */
public class CategoryService {
    ArrayList<String> categories;

     void makeCat(){
        categories = new ArrayList<String>();
        categories.add("dzis");
        categories.add("jutro");
        categories.add("w tym tygodniu");
    }

    void show(){
        for(String s : categories)
            System.out.println(s);
        }
    void categoryCheck(String category){
        if (categories.contains(category) )
        {
            System.out.println("jest kategoria");

        }
        else {
            System.out.println("dodaje kategorie");
            categoryAdd(category);

        }
    }

    void categoryAdd (String category){
        categories.add(category);
        System.out.println("dodano kategorie");
    }

}
