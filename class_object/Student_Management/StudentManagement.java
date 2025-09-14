package Student_Management;

// 🚖 Problem: Student Management (Basic Version)

// Problem Statement:
// Create a program to manage student details. Each student has:

// Name
// Roll number
// Marks in 3 subjects

// The program should:

// Store student information using a class.
// Calculate the total marks and average.
// Display student details.

// 🔹 Your Task

// Define a Student class with attributes and methods.
// Create multiple student objects.
// Print each student’s details with total & average.


class Student {
    String name;
    int roll;
    int []marks;

    Student(String name, int roll, int []marks) { // Constructor
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    int getTotalMarks() { // Method to calculate total
        int total = 0;
        for (int i : marks) {
            total += i;
        }
        return total;
    }

    double getAvgMarks() { // Method to calculate average
        return getTotalMarks()/3;
    }

    void StudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average: " + getAvgMarks());
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student("Rahul", 101, new int[]{60,50,55});
        Student s2 = new Student("Priya", 102, new int[]{70,54,75});

        // Displaying info
        s1.StudentDetails();
        s2.StudentDetails();
    }
}
