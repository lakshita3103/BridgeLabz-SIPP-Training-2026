import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2:");
        int num2 = sc.nextInt();
        System.out.print("Enter the number 3:");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Largest number is first number.");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Largest number is second number.");
        }
        else{
            System.out.println("Largest number is Third number.");
        }
        sc.close();
    }
}
