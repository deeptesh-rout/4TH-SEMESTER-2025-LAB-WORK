// PROGRAM 13 

@FunctionalInterface
interface Operation {
    int apply(int x, int y); // Abstract method
}

public class Functional_Interface {
    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        Operation add = (x, y) -> x + y;
        System.out.println("Sum: " + add.apply(5, 10)); // Output: 15
    }
}
