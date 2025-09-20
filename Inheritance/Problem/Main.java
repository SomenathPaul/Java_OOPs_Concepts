package Inheritance.Problem;

// Create a program for Employee Hierarchy:
// Class Employee → fields: name, salary. Method: displayDetails().
// Class Manager extends Employee → field: bonus. Method: displayManagerDetails().
// Create an object of Manager, set details, and print all info.

class Employee {
    String name;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    void displayManagerDetails() {
        displayDetails();
        System.out.println("Bonus: " + bonus);
    }

    
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Alice";
        m.salary = 75000;
        m.bonus = 15000;
        m.displayManagerDetails();
    }
}
