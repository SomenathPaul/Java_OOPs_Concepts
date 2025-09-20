package Abstraction.Interfaces;

interface Bank {
    double getRateOfInterest();
}

class SBI implements Bank {
    public double getRateOfInterest() {
        return 5.5;
    }
}

class HDFC implements Bank {
    public double getRateOfInterest() {
        return 6.0;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        System.out.println("SBI ROI: " + b1.getRateOfInterest());
        System.out.println("HDFC ROI: " + b2.getRateOfInterest());
    }
}
