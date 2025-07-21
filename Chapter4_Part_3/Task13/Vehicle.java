package Task13;
    import java.util.*;
            
    class Vehicle {
    String make;
    String model;
    int year;
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

// Derived class: Car
class Car extends Vehicle {
    private int numberOfDoors;
    private int numberOfWindows;
    public Car(String make, String model, int year, int numberOfDoors, int numberOfWindows) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
    }
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Maker: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Number of Windows: " + numberOfWindows);
    }
}
class Main {
    public static void main(String[] args) {
        Car car=new Car("Toyota", "Camry", 2022, 4, 4);
        car.displayDetails();
    }
}