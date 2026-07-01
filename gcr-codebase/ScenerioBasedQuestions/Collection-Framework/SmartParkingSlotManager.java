import java.util.ArrayList;
import java.util.Scanner;

public class SmartParkingSlotManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> parkingSlots = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Smart Parking Slot Manager =====");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Parked Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String vehicle = sc.nextLine();

                    if (parkingSlots.contains(vehicle)) {
                        System.out.println("Vehicle is already parked.");
                    } else {
                        parkingSlots.add(vehicle);
                        System.out.println("Vehicle entered successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Vehicle Registration Number: ");
                    vehicle = sc.nextLine();

                    if (parkingSlots.remove(vehicle)) {
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Vehicle not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Vehicle Registration Number: ");
                    vehicle = sc.nextLine();

                    if (parkingSlots.contains(vehicle)) {
                        System.out.println("Vehicle is currently parked.");
                    } else {
                        System.out.println("Vehicle is not parked.");
                    }
                    break;

                case 4:
                    if (parkingSlots.isEmpty()) {
                        System.out.println("Parking area is empty.");
                    } else {
                        System.out.println("\nCurrently Parked Vehicles:");
                        for (String v : parkingSlots) {
                            System.out.println(v);
                        }
                        System.out.println("Total Occupied Parking Slots: " + parkingSlots.size());
                    }
                    break;

                case 5:
                    System.out.println("Exiting Smart Parking Slot Manager...");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}