// Base class: Vehicle
class Vehicle {
    String brand, model;
    double price;

    Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: Rs. " + price);
    }
}

// Subclass: Car (inherits Vehicle)
class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + seatingCapacity + ", Fuel: " + fuelType);
    }
}

// Subclass: ElectricCar (inherits Car)
class ElectricCar extends Car {
    int batteryCapacity;
    double chargingTime;

    ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + batteryCapacity + " kWh, Charging: " + chargingTime + " hrs");
    }
}

// Subclass: Motorcycle (inherits Vehicle)
class Motorcycle extends Vehicle {
    int engineCapacity;
    String type;

    Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine: " + engineCapacity + "cc, Type: " + type);
    }
}

// Test class
class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 3000000, 5, "Petrol");
        ElectricCar eCar = new ElectricCar("Tesla", "Model 3", 6000000, 5, "Electric", 75, 1.5);
        Motorcycle bike = new Motorcycle("Yamaha", "R15", 200000, 155, "Sport");

        car.displayDetails();
        System.out.println();
        eCar.displayDetails();
        System.out.println();
        bike.displayDetails();
    }
}
