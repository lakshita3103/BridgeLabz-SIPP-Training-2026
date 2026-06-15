import java.util.*;
public class WordMatchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = sc.nextLine();
        System.out.print("Enter the second string: ");
        String second = sc.nextLine();
        // Remove spaces and convert to lowercase
        first = first.replace(" ", "").toLowerCase();
        second = second.replace(" ", "").toLowerCase();

        // Convert strings to character arrays
        char[] arr1 = first.toCharArray();
        char[] arr2 = second.toCharArray();

        // Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagrams.");
        } else {
            System.out.println("Strings are Not Anagrams.");
        }

        System.out.println(first.toUpperCase());
        System.out.println(second.toUpperCase());
        System.out.println(first.length());
        System.out.println(second.length());
        sc.close();
    }
}
