public class Module9_InClassActivity_StudentStarter {

    public static void main(String[] args) {

        // TODO 1: Create a Car object with brand "Toyota" and 4 doors
        // TODO 2: Call the displayDetails() method for the Car object
        // TODO 3: Create a Truck object with brand "Ford" and payload capacity 2000
        // TODO 4: Call the displayDetails() method for the Truck object

        // TODO 5: Create an ElectricCar object with brand "Tesla", 4 doors, and 100 kWh battery capacity
        // TODO 6: Call the displayDetails() method for the ElectricCar object
        // TODO 7: Call the chargeBattery() method for the ElectricCar object

        // TODO 8: Demonstrate polymorphism by storing the ElectricCar object
        // in a Vehicle reference and calling displayBrand()

        Car myCar = new Car("Toyota", 4);
        Truck myTruck = new Truck("Ford", 2000);
        ElectricCar myElectricCar = new ElectricCar("Tesla", 4, 100);

        System.out.println("=== Car Details ===");
        myCar.displayDetails();
        System.out.println();
        System.out.println("=== Truck Details ===");
        myTruck.displayDetails();
        System.out.println();
        System.out.println("=== Electric Car Details ===");
        myElectricCar.displayDetails();
        myElectricCar.chargeBattery();

        System.out.println();
        System.out.println("=== Polymorphism Demonstration ===");
        Vehicle myVehicle = myElectricCar;
        myVehicle.displayBrand();

    }
}

// TODO 9: Create the Vehicle class
class Vehicle {

    // TODO 10: Declare a protected String variable named brand

    // TODO 11: Write a constructor that accepts brand

    // TODO 12: Write a method named displayBrand()
    // that prints: Brand: [brand]

    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}


// TODO 13: Create the Car class so it extends Vehicle
class Car extends Vehicle {

    // TODO 14: Declare a private int variable named numberOfDoors
    private int numberOfDoors;
    // TODO 15: Write a constructor that accepts brand and numberOfDoors
    // Use super(brand)

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    // TODO 16: Write a method named displayDetails()
    // that calls displayBrand() and prints the number of doors
    public void displayDetails() {
        displayBrand();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}


// TODO 17: Create the Truck class so it extends Vehicle
class Truck extends Vehicle {

    // TODO 18: Declare a private int variable named payloadCapacity
    private int payloadCapacity;

    // TODO 19: Write a constructor that accepts brand and payloadCapacity
    // Use super(brand)
    public Truck(String brand, int payloadCapacity) {
        super(brand);
        this.payloadCapacity = payloadCapacity;
    }
    // TODO 20: Write a method named displayDetails()
    // that calls displayBrand() and prints the payload capacity

    public void displayDetails() {
        displayBrand();
        System.out.println("Payload Capacity: " + payloadCapacity + " lbs.");
    }
}


// TODO 21: Create the Electric interface
interface Electric {

    // TODO 22: Declare the method chargeBattery()

    void chargeBattery();
}


// TODO 23: Create the ElectricCar class so it extends Car and implements Electric
class ElectricCar extends Car implements Electric {

    // TODO 24: Declare a private int variable named batteryCapacity
    private int batteryCapacity;
    // TODO 25: Write a constructor that accepts brand, numberOfDoors, and batteryCapacity
    // Use super(brand, numberOfDoors)
    public ElectricCar(String brand, int numberOfDoors, int batteryCapacity) {
        super(brand, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }
    // TODO 26: Override chargeBattery() so it prints:
    // Charging the battery with capacity: [batteryCapacity] kWh.

    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery with capacity: " + batteryCapacity + " kWh.");
    }
    // TODO 27: Override displayDetails()
    // First call super.displayDetails()
    // Then print: Battery Capacity: [batteryCapacity] kWh

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + "kWh.");
    }
}
