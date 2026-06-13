import java.util.Scanner;

public class CharacterFrequencyNestedLoop {

    // Method to find frequency of characters using nested loops
    public static String[][] characterFrequency(String str) {
        char[] chars = str.toCharArray(); // Convert string to character array
        int len = chars.length;
        int[] freq = new int[len]; // frequency array
        boolean[] counted = new boolean[len]; // keep track of counted characters

        for (int i = 0; i < len; i++) {
            if (counted[i]) continue; // skip already counted characters
            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    counted[j] = true; // mark duplicate character
                }
            }
        }

        // Count number of unique characters to size the 2D array
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (!counted[i]) {
                uniqueCount++;
            }
        }

        // Create 2D array to store characters and their frequencies
        String[][] charFreq = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (!counted[i]) {
                charFreq[index][0] = String.valueOf(chars[i]);
                charFreq[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return charFreq;
    }

    // Method to display the 2D array
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

        // Find character frequencies
        String[][] charFreq = characterFrequency(text);

        // Display the result
        displayFrequency(charFreq);

        sc.close();
    }
}
