class MyClass {
    // Static member
    static int staticMember = 0;

    // Constructor
    MyClass() {
        staticMember++; // Increment static member each time a new instance is created
    }

    // Method to display static member value
    static void displayStaticMember() {
        System.out.println("Static member value: " + staticMember);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Display static member value
        MyClass.displayStaticMember(); // Should output: Static member value: 3
    }
}
