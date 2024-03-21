import java.lang.String;
public class Student {
    // define variables
    int rollNumber;
    String name;

    // Constructor to initialize roll number and name
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Creating a Student object with roll number 101 and name "Alice"
        Student student1 = new Student(101, "Rolando");

        // Creating another Student object with roll number 102 and name "Bob"
        Student student2 = new Student(102, "Labrador");

        // Displaying details of both students
        System.out.println("Details of Student 1:");
        student1.displayDetails();

        System.out.println("\nDetails of Student 2:");
        student2.displayDetails();
    }
}