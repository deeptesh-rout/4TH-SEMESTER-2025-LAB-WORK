/*Write a Java program with a Car class having private fields (make, model), a 
parameterized constructor, getter, and setter methods. In the CarTester class, 
instantiate myCar1 with values and myCar2 with null. Print their initial details, 
update myCar2 using setters, and print the updated details.  */

/* 
// Car class
class Car {
    // Private fields
    private String make;
    private String model;

    // Parameterized constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}

// CarTester class
public class question1 {
    public static void main(String[] args) {
        // Instantiating myCar1 with values
        Car myCar1 = new Car("Toyota", "Corolla");
        
        // Instantiating myCar2 with null values
        Car myCar2 = new Car(null, null);

        // Printing initial details of myCar1 and myCar2
        System.out.println("Initial details of myCar1:");
        myCar1.displayDetails();

        System.out.println("Initial details of myCar2:");
        myCar2.displayDetails();

        // Updating myCar2 using setters
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");

        // Printing updated details of myCar2
        System.out.println("Updated details of myCar2:");
        myCar2.displayDetails();
    }
}
*/