import java.util.*;

public class JavaQuestion1 {
    public static void main(String[] args) {
      
        PriorityQueue<String> prQueue = new PriorityQueue<String>();
       
        prQueue.add("C");
        prQueue.add("Java");
        prQueue.add("Python");
        prQueue.add("C++");

        System.out.println("The head value by using peek function is: " + prQueue.peek());

        System.out.println("The total queue elements are:");
        Iterator<String> itr1 = prQueue.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
        
        prQueue.poll();
        System.out.println("After removing an element with poll function:");
        Iterator<String> itr2 = prQueue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        prQueue.remove("Java");
        System.out.println("After removing Java with remove function:");
        Iterator<String> itr3 = prQueue.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        boolean a = prQueue.contains("C");
        System.out.println("Does this priority queue contains C: " + a);
    }
}
