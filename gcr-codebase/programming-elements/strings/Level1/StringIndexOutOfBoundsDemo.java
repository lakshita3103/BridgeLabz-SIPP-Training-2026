import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBounds(String text) {
        // Accessing index beyond the string length (will throw exception)
        System.out.println("Character at invalid index: " + text.charAt(text.length() + 1));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBounds(String text) {
        try {
            // Attempt to access invalid index
            System.out.println("Character at invalid index: " + text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException! Index is out of range.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Demonstrate unhandled exception
        System.out.println("\nDemonstrating unhandled StringIndexOutOfBoundsException:");
        try {
            generateStringIndexOutOfBounds(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Demonstrate handled exception
        System.out.println("\nDemonstrating handled StringIndexOutOfBoundsException:");
        handleStringIndexOutOfBounds(text);

        sc.close();
    }
}
