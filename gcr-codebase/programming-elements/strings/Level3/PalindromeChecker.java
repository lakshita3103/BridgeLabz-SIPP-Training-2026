import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative method comparing start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays and reversing
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        // Reverse the array using charAt
        for (int i = 0; i < original.length; i++) {
            reversed[i] = text.charAt(original.length - 1 - i);
        }

        // Compare original and reversed
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a text to check palindrome: ");
        String text = sc.nextLine();

        // Remove spaces and convert to lowercase for accurate checking
        text = text.replaceAll("\\s+", "").toLowerCase();

        // Logic 1
        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Palindrome check (Iterative): " + resultIterative);

        // Logic 2
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome check (Recursive): " + resultRecursive);

        // Logic 3
        boolean resultCharArray = isPalindromeUsingCharArray(text);
        System.out.println("Palindrome check (Char Array): " + resultCharArray);

        sc.close();
    }
}

