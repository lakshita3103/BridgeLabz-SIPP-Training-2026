import java.util.Scanner;

public class StudentFeeCalculator {

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        // User Inputs
        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter Number of Subjects: ");
        int numberOfSubjects = input.nextInt();

        System.out.print("Enter Fee per Subject: ");
        double feePerSubject = input.nextDouble();

        // Arithmetic Operators
        double totalFee = numberOfSubjects * feePerSubject;

        // Operator Precedence
        double discountedFee = totalFee - (totalFee * 10 / 100);

        // Type Conversion (or) Type-Casting
        int finalFee = (int) discountedFee;

        // Displaying Results
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Subjects: " + numberOfSubjects);
        System.out.println("Fee per Subject: " + feePerSubject);

        System.out.println("Total Fee: " + totalFee);
        System.out.println("Fee after 10% Discount: " + discountedFee);
        System.out.println("Final Fee (Integer Value): " + finalFee);

        input.close();
    }
}