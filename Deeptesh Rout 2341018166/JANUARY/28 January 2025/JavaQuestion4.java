/*v7. A technology company manufactures various types of electronic devices,
including laptops and smartphones. All devices share common attributes like
the brand and model, which are applicable to any electronic device. Laptops,
as a category of devices, have additional attributes such as the processor
type and RAM size, which define their computing power. Smartphones, on the
other hand, have unique attributes like camera resolution and battery
capacity, which are essential for mobile functionality. The company wants to
build a program that demonstrates hierarchical inheritance by creating
separate classes for laptops and smartphones, both inheriting from a base
class device */






class Device {
    
    String brand;
    String model;

   
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Derived class representing a Laptop
class Laptop extends Device {
    // Additional attributes specific to laptops
    String processorType;
    int ramSize; // in GB

    // Constructor for the Laptop class
    public Laptop(String brand, String model, String processorType, int ramSize) {
        super(brand, model); // Call the constructor of the base class
        this.processorType = processorType;
        this.ramSize = ramSize;
    }

    // Method to display laptop details
    public void displayLaptopDetails() {
        displayDetails(); // Call the method from the base class
        System.out.println("Processor Type: " + processorType);
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

// Derived class representing a Smartphone
class Smartphone extends Device {
    // Additional attributes specific to smartphones
    int cameraResolution; // in megapixels
    int batteryCapacity;  // in mAh

    // Constructor for the Smartphone class
    public Smartphone(String brand, String model, int cameraResolution, int batteryCapacity) {
        super(brand, model); // Call the constructor of the base class
        this.cameraResolution = cameraResolution;
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display smartphone details
    public void displaySmartphoneDetails() {
        displayDetails(); // Call the method from the base class
        System.out.println("Camera Resolution: " + cameraResolution + "MP");
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
    }
}

// Main class to test the program
public class JavaQuestion4 {
    public static void main(String[] args) {
        // Create a Laptop object
        Laptop laptop = new Laptop("Dell", "XPS 15", "Intel Core i7", 16);
        System.out.println("Laptop Details:");
        laptop.displayLaptopDetails();

        System.out.println("\n-------------------------\n");

        // Create a Smartphone object
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S23", 108, 5000);
        System.out.println("Smartphone Details:");
        smartphone.displaySmartphoneDetails();
    }
}
