

import java.util.Enumeration;
import java.util.Hashtable;

public class JavaQuestion2 {
    public static void main(String args[]) {
        Enumeration<String> nms;
        String keys;

        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("Key1", "Adam");
        hashtable.put("Key2", "Brian");
        hashtable.put("Key3", "Charles");
        hashtable.put("Key4", "Dean");
        hashtable.put("Key5", "Peter");

        nms = hashtable.keys();
        while (nms.hasMoreElements()) {
            keys = nms.nextElement();
            System.out.println("Key is " + keys + " & value is " + hashtable.get(keys));
        }
    }
}
