import java.util.Scanner;

public class SubstringCompareCharAt {

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for string and indices
        System.out.print("Enter the original string: ");
        String text = sc.nextLine();
        System.out.print("Enter the start index: ");
        int start = sc.nextInt();
        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        // Create substring using charAt() method
        String substringCharAt = createSubstringUsingCharAt(text, start, end);
        System.out.println("Substring using charAt(): " + substringCharAt);

        // Create substring using built-in substring() method
        String substringBuiltIn = text.substring(start, end);
        System.out.println("Substring using built-in substring(): " + substringBuiltIn);

        // Compare the two substrings
        boolean areEqual = compareStringsCharAt(substringCharAt, substringBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);

        sc.close();
    }
}
