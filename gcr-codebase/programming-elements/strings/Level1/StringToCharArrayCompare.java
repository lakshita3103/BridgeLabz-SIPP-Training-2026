import java.util.Scanner;

public class StringToCharArrayCompare {

    // Method to convert string to character array without using toCharArray()
    public static char[] stringToCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Convert string to char array using user-defined method
        char[] userDefinedArray = stringToCharArray(text);
        System.out.print("Characters using user-defined method: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Convert string to char array using built-in method
        char[] builtInArray = text.toCharArray();
        System.out.print("Characters using built-in toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Compare both arrays
        boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);
        System.out.println("Are both arrays equal? " + areEqual);

        sc.close();
    }
}
