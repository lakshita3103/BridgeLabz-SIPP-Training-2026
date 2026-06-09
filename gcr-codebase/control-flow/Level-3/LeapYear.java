import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else {
            if (year % 4 != 0) {
                System.out.println("Approach 1: " + year + " is NOT a leap year.");
            } else if (year % 100 != 0) {
                System.out.println("Approach 1: " + year + " is a leap year.");
            } else if (year % 400 == 0) {
                System.out.println("Approach 1: " + year + " is a leap year.");
            } else {
                System.out.println("Approach 1: " + year + " is NOT a leap year.");
            }

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Approach 2: " + year + " is a leap year.");
            } else {
                System.out.println("Approach 2: " + year + " is NOT a leap year.");
            }
        }

        sc.close();
    }
}
