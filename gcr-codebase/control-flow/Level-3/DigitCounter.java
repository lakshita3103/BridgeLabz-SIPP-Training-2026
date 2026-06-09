import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        int count = 0;

        if (number == 0) {
            count = 1; 
        } else {
            while (number != 0) {
                number /= 10;
            }
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
