


import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class JavaQuestion3 {
    public static void main(String[] args) {
        TreeMap<Integer, String> trmap = new TreeMap<Integer, String>();
        trmap.put(1, "Object 1");
        trmap.put(17, "Object 2");
        trmap.put(50, "Object 3");
        trmap.put(7, "Object 4");
        trmap.put(13, "Object 5");
        trmap.put(23, "Object 5");
        trmap.put(33, "Object 5");

        Set<Map.Entry<Integer, String>> set = trmap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> ment = iterator1.next();
            System.out.print("key is: " + ment.getKey() + " and Value is: ");
            System.out.println(ment.getValue());
        }
    }
}
