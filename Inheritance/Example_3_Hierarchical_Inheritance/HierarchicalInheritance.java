package Inheritance.Example_3_Hierarchical_Inheritance;

class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing Circle.");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing Rectangle.");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        
        c.area();
        c.drawCircle();
        
        r.area();
        r.drawRectangle();
    }
}
