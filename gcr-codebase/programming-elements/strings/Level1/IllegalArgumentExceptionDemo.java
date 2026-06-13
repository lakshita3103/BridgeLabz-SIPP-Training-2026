import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgument(String text) {
        // start index > end index will throw IllegalArgumentException
        System.out.println("Substring with invalid indices: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgument(String text) {
        try {
            // Attempt to create substring with invalid indices
            System.out.println("Substring with invalid indices: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException! Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Demonstrate unhandled IllegalArgumentException
        System.out.println("\nDemonstrating unhandled IllegalArgumentException:");
        try {
            generateIllegalArgument(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Demonstrate handled IllegalArgumentException
        System.out.println("\nDemonstrating handled IllegalArgumentException:");
        handleIllegalArgument(text);

        sc.close();
    }
}
