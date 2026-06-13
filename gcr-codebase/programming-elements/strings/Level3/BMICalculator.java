import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and determine status for a single person
    public static String[] calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weightKg / (heightM * heightM);
        String status = "";

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return as array of strings
        return new String[] {String.valueOf(weightKg), String.valueOf(heightCm), String.format("%.2f", bmi), status};
    }

    // Method to process the entire team and get BMI info
    public static String[][] processTeam(double[][] teamData) {
        int n = teamData.length;
        String[][] bmiInfo = new String[n][4]; // columns: Weight, Height, BMI, Status

        for (int i = 0; i < n; i++) {
            bmiInfo[i] = calculateBMI(teamData[i][0], teamData[i][1]);
        }

        return bmiInfo;
    }

    // Method to display the 2D String array in tabular format
    public static void displayBMIData(String[][] bmiInfo) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < bmiInfo.length; i++) {
            System.out.println(bmiInfo[i][1] + "\t\t" + bmiInfo[i][0] + "\t\t" + bmiInfo[i][2] + "\t\t" + bmiInfo[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teamSize = 10;
        double[][] teamData = new double[teamSize][2]; // column 0 = weight, column 1 = height

        // Take input for each person
        for (int i = 0; i < teamSize; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            while (true) {
                System.out.print("Weight (kg): ");
                double weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Invalid weight! Please enter positive number.");
                    continue;
                }
                teamData[i][0] = weight;
                break;
            }

            while (true) {
                System.out.print("Height (cm): ");
                double height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid height! Please enter positive number.");
                    continue;
                }
                teamData[i][1] = height;
                break;
            }
        }

        // Process BMI and Status
        String[][] bmiInfo = processTeam(teamData);

        // Display results
        displayBMIData(bmiInfo);

        sc.close();
    }
}
