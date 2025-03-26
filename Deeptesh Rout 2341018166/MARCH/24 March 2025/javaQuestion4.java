public class javaQuestion4 {

    public static void main(String[] args) {
        
      
        String str1 = "Hello";
        String str2 = "Hello";
        
        String str3 = new String("Hello");
        String str4 = new String("Hello");

      
        System.out.println("Comparing string literals:");
        System.out.println("str1 == str2: " + (str1 == str2)); 
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        
        System.out.println("\nComparing using 'new' keyword:");
        System.out.println("str3 == str4: " + (str3 == str4));
        System.out.println("str3.equals(str4): " + str3.equals(str4)); 
        
        
        System.out.println("\nMemory demonstration:");

      
        System.out.println("Memory location of str1: " + System.identityHashCode(str1));
        System.out.println("Memory location of str2: " + System.identityHashCode(str2));

        System.out.println("Memory location of str3: " + System.identityHashCode(str3));
        System.out.println("Memory location of str4: " + System.identityHashCode(str4));
    }
}

