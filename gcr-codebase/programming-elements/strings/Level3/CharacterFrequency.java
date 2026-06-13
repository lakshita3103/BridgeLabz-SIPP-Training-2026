import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters and return as 2D array
    public static String[][] findCharacterFrequency(String str) {
        int[] freq = new int[256]; // ASCII character frequency array

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Count number of unique characters to size the 2D array
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array to store characters and their frequencies
        String[][] charFreq = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                charFreq[index][0] = String.valueOf((char)i);
                charFreq[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return charFreq;
    }

    // Method to display 2D array
    public static void displayCharacterFrequency(String[][] charFreq) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");
        for (int i = 0; i < charFreq.length; i++) {
            System.out.println(charFreq[i][0] + "\t\t" + charFreq[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find character frequency
        String[][] charFreq = findCharacterFrequency(text);

        // Display result
        displayCharacterFrequency(charFreq);

        sc.close();
    }
}
