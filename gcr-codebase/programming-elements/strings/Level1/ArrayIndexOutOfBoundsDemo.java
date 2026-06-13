import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBounds(String[] names) {
        // Accessing index beyond array length (will throw exception)
        System.out.println("Accessing invalid index: " + names[names.length + 1]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBounds(String[] names) {
        try {
            // Accessing invalid index
            System.out.println("Accessing invalid index: " + names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException! Index is out of range.");
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for array size
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Initialize array and take input
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Demonstrate unhandled ArrayIndexOutOfBoundsException
        System.out.println("\nDemonstrating unhandled ArrayIndexOutOfBoundsException:");
        try {
            generateArrayIndexOutOfBounds(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Demonstrate handled ArrayIndexOutOfBoundsException
        System.out.println("\nDemonstrating handled ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBounds(names);

        sc.close();
    }
}
