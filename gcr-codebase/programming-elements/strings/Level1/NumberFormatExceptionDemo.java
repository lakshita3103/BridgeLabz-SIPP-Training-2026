import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // Attempt to parse text as integer (will throw NumberFormatException if not numeric)
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException! Input is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a text to parse as integer: ");
        String text = sc.nextLine();

        // Demonstrate unhandled NumberFormatException
        System.out.println("\nDemonstrating unhandled NumberFormatException:");
        try {
            generateNumberFormatException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Demonstrate handled NumberFormatException
        System.out.println("\nDemonstrating handled NumberFormatException:");
        handleNumberFormatException(text);

        sc.close();
    }
}
