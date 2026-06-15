import java.util.*;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the username: ");
        String username = sc.nextLine();

        // Check spaces
        if (username.contains(" ")) {
            System.out.println("Contains Spaces.");
        } else {
            System.out.println("No Spaces.");
        }

        // Count characters
        int count = username.length();
        System.out.println("Total Number of Characters: " + count);

        // Convert to uppercase
        String uppercase = username.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        // Reverse string
        String rev = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            rev += username.charAt(i);
        }

        System.out.println("Reversed String: " + rev);

        // Palindrome check
        if (username.equals(rev)) {
            System.out.println("Palindrome: true");
        } else {
            System.out.println("Palindrome: false");
        }

        sc.close();
    }
}