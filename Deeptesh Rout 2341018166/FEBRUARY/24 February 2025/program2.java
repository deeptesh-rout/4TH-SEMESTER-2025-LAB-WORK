
import java.util.*;

public class program2 {

    public static void main(String[] args) {
        HashSet<String> haset = new HashSet<String>();
        // Declaring Tree HshSet
        haset.add("Apricot");
        haset.add("Mango");
        haset.add("Orange");
        haset.add("Strawberry");
        haset.add("Dates");
        // adding duplicate element
        haset.add("Mango");
        haset.add("Orange");
        // adding null elements
        haset.add(null);
        haset.add(null);
        // Diplay the Stored HashSet elements
        System.out.println("HashSet:" + haset);
        // Removing Non Duplicate element
        haset.remove("Dates");
        System.out.println("HashSet:" + haset);

        HashSet<Integer> haset1 = new HashSet<Integer>();
        // Declaring Tree HshSet
        haset1.add(55);
        haset1.add(78);
        haset1.add(97);
        haset1.add(13);
        haset1.add(64);
        // adding duplicate element
        haset1.add(78);
        haset1.add(55);
        // adding null elements
        haset.add(null);
        haset.add(null);
        // Diplay the Stored HashSet elements
        System.out.println("HashSet:" + haset1);
        // Removing Non Duplicate element
        haset1.remove(55);
        System.out.println("HashSet:" + haset1);

    }
}
