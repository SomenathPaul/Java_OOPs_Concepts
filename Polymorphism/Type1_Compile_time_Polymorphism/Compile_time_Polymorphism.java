package Polymorphism.Type1_Compile_time_Polymorphism;

class Calculator {
    // method overloading
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Compile_time_Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));        // calls int add
        System.out.println(calc.add(5.5, 4.5));    // calls double add
        System.out.println(calc.add(1, 2, 3));     // calls 3-arg add
    }
}
