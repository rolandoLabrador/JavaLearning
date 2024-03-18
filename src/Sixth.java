        public class Sixth {
            public static void main(String[] args) {
                int number = 12345;
                int sum = 0;

                // Convert the number to a string to iterate through its digits
                String numberAsString = String.valueOf(number);

                // Iterate through each character in the string representation of the number
                for (int i = 0; i < numberAsString.length(); i++) {
                    // Convert each character back to its numeric value and add it to the sum
                    int digit = Character.getNumericValue(numberAsString.charAt(i));
                    sum += digit;
                }

                System.out.println("Sum of digits in " + number + " is: " + sum);
            }
        }


