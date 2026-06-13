import java.util.Scanner;

public class TrimStringCustom {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndices(String str) {
        int length = str.length();
        int start = 0;
        int end = length - 1;

        // Find first non-space character
        while (start < length && str.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] {start, end};
    }

    // Method to create a substring using charAt()
    public static String substringCustom(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        // Custom trim
        int[] indices = findTrimIndices(text);
        String trimmedCustom = "";
        if (indices[0] <= indices[1]) { // Check if string has non-space characters
            trimmedCustom = substringCustom(text, indices[0], indices[1]);
        }

        System.out.println("Trimmed using custom method: '" + trimmedCustom + "'");

        // Built-in trim
        String trimmedBuiltIn = text.trim();
        System.out.println("Trimmed using built-in trim(): '" + trimmedBuiltIn + "'");

        // Compare the results
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Are both trimmed results equal? " + areEqual);

        sc.close();
    }
}
