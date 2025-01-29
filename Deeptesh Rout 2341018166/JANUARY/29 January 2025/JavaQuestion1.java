public class JavaQuestion1 {
    public static void main(String[] args) {
       
        System.out.println(Shape.calculateArea(45));  
        System.out.println(Shape.calculateArea(5.0)); 
    }
}

class Shape {
    
    static double calculateArea(double length, double breadth) {
        return length * breadth;
    }

   
    static int calculateArea(int side) {
        return side * side;
    }

    
    static int calculateArea(int height, int base) {
        return (height * base) / 2;
    }

   
    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
