import java.util.Scanner;

public class UppercaseConversionCompare {

    // Method to convert string to uppercase using charAt() and ASCII logic
    public static String toUpperCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase using ASCII difference
                ch = (char)(ch - ('a' - 'A'));
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
        String upperCustom = toUpperCaseCustom(text);
        System.out.println("Uppercase using custom method: " + upperCustom);

        // Convert using built-in method
        String upperBuiltIn = text.toUpperCase();
        System.out.println("Uppercase using built-in method: " + upperBuiltIn);

        // Compare the two results
        boolean areEqual = compareStrings(upperCustom, upperBuiltIn);
        System.out.println("Are both uppercase conversions equal? " + areEqual);

        sc.close();
    }
}

