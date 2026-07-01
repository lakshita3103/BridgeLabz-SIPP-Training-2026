import java.util.HashSet;
import java.util.Scanner;

public class EventEntryVerificationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<String> participants = new HashSet<>();

        int choice;

        do {
            System.out.println("\n===== Event Entry Verification System =====");
            System.out.println("1. Register Participant");
            System.out.println("2. Display Registered Participants");
            System.out.println("3. Display Total Attendees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Participant Email ID: ");
                    String email = sc.nextLine();

                    if (participants.add(email)) {
                        System.out.println("Registration Successful.");
                    } else {
                        System.out.println("Duplicate Registration! Entry Rejected.");
                    }
                    break;

                case 2:
                    if (participants.isEmpty()) {
                        System.out.println("No participants registered.");
                    } else {
                        System.out.println("\nRegistered Participants:");
                        for (String participant : participants) {
                            System.out.println(participant);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Total Eligible Attendees: " + participants.size());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}