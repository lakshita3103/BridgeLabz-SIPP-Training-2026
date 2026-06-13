import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
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

    // Method to split text into words without using split()
    public static String[] splitTextCustom(String text) {
        int length = findLength(text);
        int wordCount = 1;

        // Count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1; // before first character
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length; // after last character

        // Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word lengths
    public static String[] findShortestLongest(String[][] wordLengths) {
        if (wordLengths.length == 0) {
            return new String[] {"", ""};
        }

        int minLength = Integer.parseInt(wordLengths[0][1]);
        int maxLength = Integer.parseInt(wordLengths[0][1]);
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];

        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < minLength) {
                minLength = len;
                shortest = wordLengths[i][0];
            }
            if (len > maxLength) {
                maxLength = len;
                longest = wordLengths[i][0];
            }
        }

        return new String[] {shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split into words
        String[] words = splitTextCustom(text);

        // Get 2D array of words and their lengths
        String[][] wordLengths = wordsWithLengths(words);

        // Find shortest and longest words
        String[] shortestLongest = findShortestLongest(wordLengths);

        System.out.println("\nShortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);

        sc.close();
    }
}
