
import java.util.*;

public class program3 {
    public static void main(String[] args) {
        // Creating a TreeSet for Strings
        TreeSet<String> haset = new TreeSet<String>();

        // Adding elements to the TreeSet
        haset.add("Apricot");
        haset.add("Mango");
        haset.add("Orange");
        haset.add("Strawberry");
        haset.add("Dates");

        // Adding duplicate elements (duplicates will not be added)
        haset.add("Mango");
        haset.add("Orange");

        // Displaying the TreeSet elements (duplicates will not appear)
        System.out.println("TreeSet: " + haset);

        // Removing an element from the TreeSet
        haset.remove("Dates");
        System.out.println("TreeSet : " + haset);

        // Creating a TreeSet for Integers
        TreeSet<Integer> haset1 = new TreeSet<Integer>();

        // Adding elements to the TreeSet
        haset1.add(55);
        haset1.add(78);
        haset1.add(97);
        haset1.add(13);
        haset1.add(64);

        // Adding duplicate elements (duplicates will not be added)
        haset1.add(78);
        haset1.add(55);

        // Displaying the TreeSet elements (duplicates will not appear)
        System.out.println("TreeSet: " + haset1);

        // Removing an element from the TreeSet
        haset1.remove(55);
        System.out.println("TreeSet: " + haset1);
    }
}
