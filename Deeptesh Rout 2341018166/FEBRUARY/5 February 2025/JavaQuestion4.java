

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaQuestion4 {
    public static void main(String[] args) {
        // Declaring a LinkedHashMap
        LinkedHashMap<Integer, String> li = new LinkedHashMap<Integer, String>();
        
        // Adding elements to this collection map
        li.put(21, "Abe");
        li.put(35, "Drown");
        li.put(1, "Jack");
        li.put(3, "Karen");
        li.put(100, "Lin");

        // Generating the required set
        Set<Map.Entry<Integer, String>> set1 = li.entrySet();
        
        // Displaying elements from this collection map
        Iterator<Map.Entry<Integer, String>> iter1 = set1.iterator();
        while (iter1.hasNext()) {
            Map.Entry<Integer, String> me = iter1.next();
            System.out.print("The key is: " + me.getKey() + " and Value is: " + me.getValue() + "\n");
        }
    }
}
