package Polymorphism.Problems;

// Interest = P × R × T
// P = Principal (your original deposit)
// R = Annual interest rate (as a decimal)
// T = Time in years.

class Bank {
    double getRateOfInterest(double p, double t) {
        double r = 6;
        return (p*t*r); // default rate
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest(double p, double t) {
        double r = 5;
        return (p*t*r);
    }
}
class HDFC extends Bank {
    @Override
    double getRateOfInterest(double p, double t) {
        double r = 6;
        return (p*t*r);
    }
}

class ICICI extends Bank {
    @Override
    double getRateOfInterest(double p, double t) {
        double r = 6.5;
        return (p*t*r);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        double p = 10000; // principal
        double t = 1;     // time in years

        System.out.println("SBI Interest: " + sbi.getRateOfInterest(p, t));
        System.out.println("HDFC Interest: " + hdfc.getRateOfInterest(p, t));
        System.out.println("ICICI Interest: " + icici.getRateOfInterest(p, t));
    }
}
