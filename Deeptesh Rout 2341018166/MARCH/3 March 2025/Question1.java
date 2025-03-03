
import java.util.*;

public class Question1 {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        ArrayList ar = new ArrayList<>(5);
        for (int i = 1; i <= 5; i++) {
            ar.add(i);
        }
        System.out.println("Initially ArrayList : " + ar);

        ar.add(2, 99);
        System.out.println("After Adding 99 at index 2 : " + ar);
        System.out.println("Element at index 3 : " + ar.get(3));

        ar.remove(2);
        System.out.println("After removing element at index 2 : " + ar);

        System.out.println("Index of element 4 : " + ar.indexOf(4));

        System.out.println("Size of the ArrayList : " + ar.size());

        System.out.println("Is the ArrayList empty? : " + ar.isEmpty());

        ar.clear();

        System.out.println("ArrayList after clear() : " + ar);

        System.out.println("Is the ArrayList empty after clear()? : " + ar.isEmpty());

    }

}
