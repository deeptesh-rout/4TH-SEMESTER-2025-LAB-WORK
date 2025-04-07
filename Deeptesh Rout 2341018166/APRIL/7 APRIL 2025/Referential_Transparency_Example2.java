

class Adder { 
    public static int add(int a, int b) {
        a *= 2;
        return a + b;
    }
}

public class Referential_Transparency_Example2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        
        int result1 = Adder.add(x, y); 
        
        int result2 = x + y; 
        
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
