/*A spy agency encodes messages. Reverse a secret message, check if
it is a palindrome, count vowels/consonants, and verify if two
intercepts are anagrams. Extend: find the first non-repeating
character in a surveillance log. */


import java.util.Arrays;

public class SpyAgency {

    // Reverse message
    public static String reverseMessage(String msg) {
        String rev = "";
        for (int i = msg.length() - 1; i >= 0; i--) {
            rev += msg.charAt(i);
        }
        return rev;
    }

    // Check palindrome
    public static boolean isPalindrome(String msg) {
        String rev = reverseMessage(msg);
        return msg.equalsIgnoreCase(rev);
    }

    // Count vowels and consonants
    public static void countVowelsConsonants(String msg) {
        int vowels = 0, consonants = 0;

        msg = msg.toLowerCase();

        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }

    // Check anagrams
    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Find first non-repeating character
    public static char firstNonRepeating(String str) {

        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                return str.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String message = "madam";

        System.out.println("Original Message: " + message);
        System.out.println("Reversed Message: " + reverseMessage(message));

        if (isPalindrome(message))
            System.out.println("Message is a Palindrome");
        else
            System.out.println("Message is not a Palindrome");

        countVowelsConsonants(message);

        String intercept1 = "listen";
        String intercept2 = "silent";

        if (areAnagrams(intercept1, intercept2))
            System.out.println("Intercepts are Anagrams");
        else
            System.out.println("Intercepts are not Anagrams");

        String log = "swiss";

        char ch = firstNonRepeating(log);

        if (ch != '\0')
            System.out.println("First Non-Repeating Character = " + ch);
        else
            System.out.println("No unique character found");
    }
}