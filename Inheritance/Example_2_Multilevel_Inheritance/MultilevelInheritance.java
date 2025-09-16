package Inheritance.Example_2_Multilevel_Inheritance;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal can walk.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // from Animal
        d.walk();  // from Mammal
        d.bark();  // from Dog
    }
}
