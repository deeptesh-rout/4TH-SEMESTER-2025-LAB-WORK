
public class javaQuestion3 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("After appending: " + stringBuilder.append(" World"));
        System.out.println("After inserting: " + stringBuilder.insert(5, " Java"));
        System.out.println("After replacing: " + stringBuilder.replace(6, 10, " Universe"));
        System.out.println("After deleting: " + stringBuilder.delete(5, 11));
        System.out.println("After reversing: " + stringBuilder.reverse());
        System.out.println("Capacity of the StringBuffer: " + stringBuilder.capacity());
        stringBuilder.ensureCapacity(50);
        System.out.println("Ensured Capacity: " + stringBuilder.capacity());
        System.out.println("Character at index 3: " + stringBuilder.charAt(3));
        System.out.println("Length of StringBuffer: " + stringBuilder.length());
        System.out.println("Substring from index 3: " + stringBuilder.substring(3));
        System.out.println("Substring from index 3 to 7: " + stringBuilder.substring(3, 7));

    }

}
