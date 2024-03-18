public class Fourth {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        int greatest = num1; // Assume num1 is the greatest initially

        // Compare num2 with greatest
        if (num2 > greatest) {
            greatest = num2; // Update greatest if num2 is greater
        }

        // Compare num3 with greatest
        if (num3 > greatest) {
            greatest = num3; // Update greatest if num3 is greater
        }

        // Print the greatest number
        System.out.println("The greatest number is: " + greatest);
    }
}
// we can also use the Math.max method






