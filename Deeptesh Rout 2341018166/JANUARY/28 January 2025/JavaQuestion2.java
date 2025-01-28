public class JavaQuestion2 {

    public static void main(String[] args) {
        Electric tesla = new Electric("Tesla Model 3", 4, "Electric", "Lithium-ion", 350);
        tesla.CarDetails();
    }

}

abstract class Vehicle {
    
    String Name;
    int num_of_doors;
    String Type_of_fuel;

 
    abstract void CarModel();
    abstract void Carmake();
}

class Car extends Vehicle {
    
    Car(String name, int doors, String fuel) {
        this.Name = name;
        this.num_of_doors = doors;
        this.Type_of_fuel = fuel;
    }

    @Override
    void CarModel() {
        System.out.println("Car Model: " + this.Name);
    }

    @Override
    void Carmake() {
        System.out.println("Car Fuel Type: " + this.Type_of_fuel);
    }

   
    void CarDetails() {
        CarModel();
        Carmake();
        System.out.println("Number of Doors: " + this.num_of_doors);
    }
}

class Electric extends Car {
  
    String BatteryType;
    int Range;

  
    Electric(String name, int doors, String fuel, String batteryType, int range) {
        super(name, doors, fuel); 
        this.BatteryType = batteryType;
        this.Range = range;
    }

    @Override
    void CarModel() {
        super.CarModel(); 
        System.out.println("Electric Car Model: " + this.Name);
    }

    @Override
    void Carmake() {
        super.Carmake();  
        System.out.println("Electric Car Fuel Type (Battery): " + this.Type_of_fuel);
    }

   
    void ElectricCarDetails() {
        CarDetails(); 
        System.out.println("Battery Type: " + this.BatteryType);
        System.out.println("Range (miles): " + this.Range);
    }
}



