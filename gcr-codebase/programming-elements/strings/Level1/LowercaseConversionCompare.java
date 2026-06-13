import java.util.Scanner;

public class LowercaseConversionCompare {

    // Method to convert string to lowercase using charAt() and ASCII logic
    public static String toLowerCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase using ASCII difference
                ch = (char)(ch + ('a' - 'A'));
            }
            result += ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
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

        // Input text from user
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Convert using custom method
        String lowerCustom = toLowerCaseCustom(text);
        System.out.println("Lowercase using custom method: " + lowerCustom);

        // Convert using built-in method
        String lowerBuiltIn = text.toLowerCase();
        System.out.println("Lowercase using built-in method: " + lowerBuiltIn);

        // Compare the two results
        boolean areEqual = compareStrings(lowerCustom, lowerBuiltIn);
        System.out.println("Are both lowercase conversions equal? " + areEqual);

        sc.close();
    }
}
