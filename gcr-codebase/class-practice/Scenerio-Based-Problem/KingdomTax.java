/*A kingdom's tax system charges 5% for income <10K, 15% for 10K–
50K, 30% above 50K. Read a citizen's income, print tax bracket and
amount. Extend: loop over an array of 10 citizens and tally total tax
collected. */

import java.util.Scanner;

public class KingdomTax {

    public static double calculateTax(double income) {
        if (income < 10000) {
            return income * 0.05;
        } else if (income <= 50000) {
            return income * 0.15;
        } else {
            return income * 0.30;
        }
    }

    public static String getTaxBracket(double income) {
        if (income < 10000) {
            return "5% Tax Bracket";
        } else if (income <= 50000) {
            return "15% Tax Bracket";
        } else {
            return "30% Tax Bracket";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] income = new double[10];
        double totalTax = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            income[i] = sc.nextDouble();

            double tax = calculateTax(income[i]);
            String bracket = getTaxBracket(income[i]);

            System.out.println("Tax Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);
            System.out.println();

            totalTax += tax;
        }

        System.out.println("Total Tax Collected = " + totalTax);

        sc.close();
    }
}