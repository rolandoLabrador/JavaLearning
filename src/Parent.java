// Parent class
class Parent {
    // Data member
    protected int parentData = 10; // Accessible to child classes

    // Member function
    protected void parentFunction() {
        System.out.println("Inside parentFunction: parentData = " + parentData);
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    // Member function in child class
    public void childFunction() {
        System.out.println("Inside childFunction");

        // Accessing parentData and parentFunction from the parent class
        System.out.println("Accessing parentData from child: " + parentData);
        parentFunction();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of Child class
        Child childObj = new Child();

        // Calling childFunction
        childObj.childFunction();
    }
}
