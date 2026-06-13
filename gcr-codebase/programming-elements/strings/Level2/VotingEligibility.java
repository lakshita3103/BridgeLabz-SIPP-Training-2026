import java.util.Scanner;

public class VotingEligibility {

    // Method to get ages of n students (user input)
    public static int[] getStudentAges(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter age of student " + (i + 1) + ": ");
                int age = sc.nextInt();
                if (age < 0) {
                    System.out.println("Invalid age! Please enter a positive number.");
                } else {
                    ages[i] = age;
                    break;
                }
            }
        }
        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // store age as string
            if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nAge\tEligibility");
        System.out.println("------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;

        // Get ages from user
        int[] ages = getStudentAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingData = checkVotingEligibility(ages);

        // Display results
        displayTable(votingData);
    }
}
