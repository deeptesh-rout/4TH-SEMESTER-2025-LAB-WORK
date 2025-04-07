

interface RectangleFunction {
    double calculate();
}

public class Arguments_Of_A_functions_include_a_Single_or_multiple_functions {
    
    
    public static double areaOfRectangle(RectangleFunction lengthFunction, RectangleFunction breadthFunction) {
        double length = lengthFunction.calculate();
        double breadth = breadthFunction.calculate();
        return length * breadth; 
    }

    public static void main(String[] args) {
        
        
        RectangleFunction lengthValue = new RectangleFunction() {
            @Override
            public double calculate() {
                double length = 5.0;
                return length;
            }
        };
        
        
        RectangleFunction breadthValue = new RectangleFunction() {
            @Override
            public double calculate() {
                double breadth = 4.0;
                return breadth;
            }
        };
        
        
        double area = areaOfRectangle(lengthValue, breadthValue);
        System.out.println("Area of Rectangle: " + area); 
    }
}
