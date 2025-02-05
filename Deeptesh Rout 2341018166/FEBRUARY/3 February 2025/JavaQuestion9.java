

public class JavaQuestion9 {
    public static void main(String[] args) {
        Car myCar = new Car("Mercedez Benz", "S Class", "MH05 12345");
        Car carInGarage = new Car("Mercedez Benz", "S Class", "MH05 12345");
        
        if (myCar.equals(carInGarage)) {
            System.out.println("Yay!!! This is my Car!");
        }
    }
}

class Car {
    private String brand;
    private String model;
    private String registrationNumber;
    
    Car(String brand, String model, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }
    
    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car car = (Car) o;
            if (car.getBrand().equals(this.brand) && 
                car.getModel().equals(this.getModel()) && 
                car.getRegistrationNumber().equals(this.getRegistrationNumber())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
