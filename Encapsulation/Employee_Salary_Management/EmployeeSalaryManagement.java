package Encapsulation.Employee_Salary_Management;

// 📝 Question: Employee Salary Management

// Create a class Employee with the following requirements:

// Private fields:
// name (String)
// employeeId (int)
// salary (double)

// Public methods:
// setSalary(double salary) → Salary must be greater than 0, otherwise show "Invalid salary".
// getSalary() → Return the salary.
// setName(String name) → Set employee’s name.
// getName() → Return employee’s name.
// setEmployeeId(int id) → Set employee ID.
// getEmployeeId() → Return employee ID.

// In the main() method:
// Create two Employee objects.
// Set their details using setters.
// Print their details using getters.

class Employee {
    private String name;
    private int empID;
    private double salary;
    
    // constructor
    Employee(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        setSalary(salary);
    }
    
    // Getter method
    public String getName() {
        return name;
    }
    public int getID() {
        return empID;
    }
    public double getSalary() {
        return salary;
    }
    
    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int empID) {
        this.empID = empID;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary must be greater than 0.");
        }
    }


    // Method to display details
    void displayDetails() {
        if(salary > 0) {
            System.out.println("Name : " + getName());
            System.out.println("Employee ID : " + getID());
            System.out.println("Salary : " + getSalary());
            System.out.println("-----------------------");
        } else {
            System.out.println("Invalid salary");
        }
    }
}


public class EmployeeSalaryManagement {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 101, 5000.00);
        Employee e2 = new Employee("Robin", 102, 3000.00);
        
        e1.displayDetails();
        e2.displayDetails();

        // Using setters to update
        e2.setSalary(4000.00);
        e2.displayDetails();
    }
}
