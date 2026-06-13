import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find the length of a string without using length()
    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached end of string
        }
        return count;
    }

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String str) {
        int len = stringLength(str);
        char[] temp = new char[len]; // temporary array to store unique chars
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            // Check if character already exists in temp
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // Create final array with exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    // Method to find frequency of unique characters and return as 2D array
    public static String[][] frequencyOfUniqueCharacters(String str) {
        char[] uniqueChars = uniqueCharacters(str);
        int[] freq = new int[256]; // frequency array for all ASCII chars

        // Count frequency of each character
        for (int i = 0; i < stringLength(str); i++) {
            freq[str.charAt(i)]++;
        }

        // Create 2D array to store character and frequency
        String[][] charFreq = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            charFreq[i][0] = String.valueOf(uniqueChars[i]);
            charFreq[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return charFreq;
    }

    // Method to display 2D array
    public static void displayFrequency(String[][] charFreq) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");
        for (int i = 0; i < charFreq.length; i++) {
            System.out.println(charFreq[i][0] + "\t\t" + charFreq[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get frequency of unique characters
        String[][] charFreq = frequencyOfUniqueCharacters(text);

        // Display the result
        displayFrequency(charFreq);

        sc.close();
    }
}

