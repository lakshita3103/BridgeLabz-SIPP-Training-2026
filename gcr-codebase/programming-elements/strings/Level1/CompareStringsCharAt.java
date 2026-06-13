import java.util.Scanner;

public class CompareStringsCharAt {
    
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings of different length are not equal
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Found different character
            }
        }
        return true; // All characters are the same
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two strings
        System.out.print("Enter the first string: ");
        String str1 = sc.next();
        System.out.print("Enter the second string: ");
        String str2 = sc.next();

        // Compare using charAt() method
        boolean charAtResult = compareUsingCharAt(str1, str2);
        System.out.println("Comparison using charAt() method: " + charAtResult);

        // Compare using built-in equals() method
        boolean equalsResult = str1.equals(str2);
        System.out.println("Comparison using equals() method: " + equalsResult);

        // Check if both results are the same
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }

        sc.close();
    }
}
