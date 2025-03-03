
import java.util.*;

public class Question3 {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        LinkedList li = new LinkedList<>();
        li.add("a");
        li.add("b");
        li.addLast("c");
        li.addFirst("d");
        li.add(2, "e");
        System.out.println("Initially LinkedList : " + li);
        System.out.println("First element : " + li.getFirst());
        System.out.println("Last element : " + li.getLast());
        System.out.println("Element at index 2 : " + li.get(2));

        li.remove("b");
        li.remove(3);
        li.removeFirst();
        li.removeLast();

        System.out.println("After Removals : " + li);

        System.out.println("Index of 'e' : " + li.indexOf("e"));

        System.out.println("Size of the LinkedList : " + li.size());
        System.out.println("Is the LinkedList empty? : " + li.isEmpty());

        li.clear();

        System.out.println("LinkedList after clear() : " + li);

        System.out.println("Is the LinkedList empty after clear()? : " + li.isEmpty());

    }
}
