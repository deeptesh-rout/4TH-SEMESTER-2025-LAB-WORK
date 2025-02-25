
import java.util.*;

public class program1 {
    public static void main(String[] args) {
        LinkedHashSet<String> haset = new LinkedHashSet<String>();
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
        System.out.println(" LinkedHashSet:" + haset);
        // Removing Non Duplicate element
        haset.remove("Dates");
        System.out.println(" LinkedHashSet:" + haset);

        LinkedHashSet<Integer> haset1 = new LinkedHashSet<Integer>();
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
        System.out.println(" LinkedHashSet:" + haset1);
        // Removing Non Duplicate element
        haset1.remove(55);
        System.out.println(" LinkedHashSet:" + haset1);

    }
}
