import java.util.Scanner;

public class CharacterTypeChecker {

    // Method to check the type of character
    public static String checkChar(char ch) {
        // Convert uppercase to lowercase if needed
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + ('a' - 'A'));
        }

        // Check if it is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to classify characters in a string
    public static String[][] classifyCharacters(String text) {
        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkChar(ch);
        }

        return result;
    }

    // Method to display a 2D array in tabular format
    public static void displayTable(String[][] array) {
        System.out.println("\nCharacter\tType");
        System.out.println("----------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + "\t\t" + array[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Classify characters
        String[][] classification = classifyCharacters(text);

        // Display results
        displayTable(classification);

        sc.close();
    }
}
