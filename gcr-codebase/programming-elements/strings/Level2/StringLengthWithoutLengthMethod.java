import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Try to access character at index
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached end of string, return count
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find length using user-defined method
        int customLength = findLength(text);
        System.out.println("Length of string using custom method: " + customLength);

        // Find length using built-in method
        int builtInLength = text.length();
        System.out.println("Length of string using built-in length(): " + builtInLength);

        sc.close();
    }
}
