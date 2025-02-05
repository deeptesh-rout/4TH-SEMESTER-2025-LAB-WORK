/*A global logistics company manages various transport vehicles, including
trucks, ships, airplanes, and a specialized category of minitrucks. All
vehicles share common attributes like vehicle ID, capacity, and route. Trucks
have additional details, such as the number of axles and whether they are
refrigerated. Ships include deck size and sailing range, while airplanes have
maximum altitude and engine type. Minitrucks, derived from the Truck class,
have specific attributes like payload capacity and fuel efficiency. The
company wants to build a program using hierarchical inheritance, with a base
class Vehicle and derived classes for Truck, Ship, Airplane, and Minitruck.
The program should allow setting and displaying attributes, and calculate
transport time based on vehicle type, speed, and route distance. */


// Base class Vehicle
class Vehicle {
    private String vehicleID;
    private double capacity;
    private double routeDistance; 

    public Vehicle(String vehicleID, double capacity, double routeDistance) {
        this.vehicleID = vehicleID;
        this.capacity = capacity;
        this.routeDistance = routeDistance;
    }

    public void displayAttributes() {
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Capacity: " + capacity + " tons");
        System.out.println("Route Distance: " + routeDistance + " km");
    }

    public double calculateTransportTime(double speed) { // speed in km/h
        return routeDistance / speed;
    }
}

// Derived class Truck
class Truck extends Vehicle {
    private int numberOfAxles;
    private boolean isRefrigerated;

    public Truck(String vehicleID, double capacity, double routeDistance, int numberOfAxles, boolean isRefrigerated) {
        super(vehicleID, capacity, routeDistance);
        this.numberOfAxles = numberOfAxles;
        this.isRefrigerated = isRefrigerated;
    }

    @Override
    public void displayAttributes() {
        super.displayAttributes();
        System.out.println("Number of Axles: " + numberOfAxles);
        System.out.println("Refrigerated: " + (isRefrigerated ? "Yes" : "No"));
    }
}

// Derived class Ship
class Ship extends Vehicle {
    private double deckSize; // in square meters
    private double sailingRange; // in nautical miles

    public Ship(String vehicleID, double capacity, double routeDistance, double deckSize, double sailingRange) {
        super(vehicleID, capacity, routeDistance);
        this.deckSize = deckSize;
        this.sailingRange = sailingRange;
    }

    @Override
    public void displayAttributes() {
        super.displayAttributes();
        System.out.println("Deck Size: " + deckSize + " sq. meters");
        System.out.println("Sailing Range: " + sailingRange + " nautical miles");
    }
}

// Derived class Airplane
class Airplane extends Vehicle {
    private double maxAltitude; // in feet
    private String engineType;

    public Airplane(String vehicleID, double capacity, double routeDistance, double maxAltitude, String engineType) {
        super(vehicleID, capacity, routeDistance);
        this.maxAltitude = maxAltitude;
        this.engineType = engineType;
    }

    @Override
    public void displayAttributes() {
        super.displayAttributes();
        System.out.println("Max Altitude: " + maxAltitude + " feet");
        System.out.println("Engine Type: " + engineType);
    }
}

// Derived class Minitruck (derived from Truck)
class Minitruck extends Truck {
    private double payloadCapacity; // in tons
    private double fuelEfficiency; // in km per liter

    public Minitruck(String vehicleID, double capacity, double routeDistance, int numberOfAxles, boolean isRefrigerated, double payloadCapacity, double fuelEfficiency) {
        super(vehicleID, capacity, routeDistance, numberOfAxles, isRefrigerated);
        this.payloadCapacity = payloadCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void displayAttributes() {
        super.displayAttributes();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
    }
}

public class JavaQuestion3 {
    public static void main(String[] args) {
        // Create instances of each type of vehicle
        Truck truck = new Truck("T001", 20, 500, 6, true);
        Ship ship = new Ship("S001", 1000, 2000, 5000, 10000);
        Airplane airplane = new Airplane("A001", 50, 1000, 35000, "Jet");
        Minitruck minitruck = new Minitruck("M001", 5, 300, 4, false, 2, 15);

        // Display attributes of each vehicle
        System.out.println("--- Truck ---");
        truck.displayAttributes();
        System.out.println("Transport Time: " + truck.calculateTransportTime(80) + " hours\n");

        System.out.println("--- Ship ---");
        ship.displayAttributes();
        System.out.println("Transport Time: " + ship.calculateTransportTime(40) + " hours\n");

        System.out.println("--- Airplane ---");
        airplane.displayAttributes();
        System.out.println("Transport Time: " + airplane.calculateTransportTime(600) + " hours\n");

        System.out.println("--- Minitruck ---");
        minitruck.displayAttributes();
        System.out.println("Transport Time: " + minitruck.calculateTransportTime(60) + " hours\n");
    }
}
