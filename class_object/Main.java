// A simple Java program to understand Classes and Objects
class Car {
    // Fields (data members / variables)
    String brand;
    int speed;

    // Constructor
    Car(String brand, int speed) {
        this.brand = brand;   // 'this' refers to current object
        this.speed = speed;
    }

    // Method (function inside a class)
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }

    void brake() {
        System.out.println(brand + " has stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car("Tesla", 120);
        Car car2 = new Car("BMW", 100);

        // Calling methods on objects
        car1.drive();
        car2.drive();

        car1.brake();
        car2.brake();
    }
}
