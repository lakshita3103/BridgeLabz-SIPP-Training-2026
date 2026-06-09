import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amar Age and Height: ");
        int ageA = sc.nextInt();
        double heightA = sc.nextDouble();

        System.out.print("Akbar Age and Height: ");
        int ageB = sc.nextInt();
        double heightB = sc.nextDouble();

        System.out.print("Anthony Age and Height: ");
        int ageC = sc.nextInt();
        double heightC = sc.nextDouble();

        // Youngest
        if (ageA < ageB && ageA < ageC)
            System.out.println("Youngest: Amar");
        else if (ageB < ageC)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        // Tallest
        if (heightA > heightB && heightA > heightC)
            System.out.println("Tallest: Amar");
        else if (heightB > heightC)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
        sc.close();
    }
}