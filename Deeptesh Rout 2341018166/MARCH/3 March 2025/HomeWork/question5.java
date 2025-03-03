
// Rectangle class
class Rectangle {
    // Private attributes
    private double length;
    private double width;

    // Constructor to initialize attributes
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display the details of the rectangle
    public void displayDetails() {
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

// Main class
public class question5 {
    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

        // Display the area and perimeter of the rectangle
        myRectangle.displayDetails();
        
        // Update the attributes of the rectangle
        myRectangle.setLength(7.0);
        myRectangle.setWidth(4.0);
        
        // Display the updated area and perimeter
        System.out.println("\nUpdated details of the rectangle:");
        myRectangle.displayDetails();
    }
}
