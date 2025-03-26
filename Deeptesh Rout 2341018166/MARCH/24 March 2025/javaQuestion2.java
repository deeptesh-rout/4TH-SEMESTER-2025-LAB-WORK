
public class javaQuestion2 {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("After appening: " + stringBuffer.append(" World"));
        System.out.println("After inserting: " + stringBuffer.insert(5, " Java"));
        System.out.println("After replacing: " + stringBuffer.replace(5, 10, " Universe"));
        System.out.println("After deleting: " + stringBuffer.delete(5, 14));
        System.out.println("After reversing: " + stringBuffer.reverse());
        System.out.println("Capacity of the StringBuffer: " + stringBuffer.capacity());
        stringBuffer.ensureCapacity(50);
        System.out.println("Ensured Capacity: " + stringBuffer.capacity());
        System.out.println("Character at index 3: " + stringBuffer.charAt(3));
        System.out.println("Length of StringBuffer: " + stringBuffer.length());
        System.out.println("Substring from index 3: " + stringBuffer.substring(3));
        System.out.println("Substring from index 3 to 7: " + stringBuffer.substring(3, 7));

    }
}
