import java.util.Scanner;

public class SplitTextCompare {

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
        // Count number of words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store start and end indexes of words
        int[] spaceIndexes = new int[wordCount + 1]; // +1 to handle last word
        int index = 0;
        spaceIndexes[index++] = -1; // Before first character
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length; // End after last character

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

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Split using custom method
        String[] customWords = splitTextCustom(text);
        System.out.println("\nWords using custom method:");
        for (String word : customWords) {
            System.out.println(word);
        }

        // Split using built-in split() method
        String[] builtInWords = text.split(" ");
        System.out.println("\nWords using built-in split():");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Compare both arrays
        boolean areEqual = compareStringArrays(customWords, builtInWords);
        System.out.println("\nAre both splits equal? " + areEqual);

        sc.close();
    }
}
