import java.util.Random;

public class RandomValues2 {


        public static void main(String[] args) {
            int[] numbers = new int[10]; // Create an array to store the random numbers

            Random rand = new Random();

            for (int i = 0; i < numbers.length; i++) {
                // Generate a random number between 1 and 100 (inclusive)
                int randomNumber = rand.nextInt(100) + 1;

                // Store the random number in the array
                numbers[i] = randomNumber;
            }

            // Print the generated random numbers
            System.out.println("Generated random numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }
