package Abstraction.Abstract_Classes;

abstract class Vehicle {
    abstract void start();   // abstract method (no body)
    
    void stop() {           // concrete method
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick.");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start(); // Car starts with a key.
        v2.start(); // Bike starts with a kick.
        v1.stop();
    }
}
