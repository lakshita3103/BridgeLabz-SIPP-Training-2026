import java.util.*;
public class CheckSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2:");
        int num2 = sc.nextInt();
        System.out.print("Enter the number 3:");
        int num3 = sc.nextInt();

        if(num1>num2){
            System.out.println("First number is not smallest.");
        }
        else if(num1>num3){
            System.out.println("First number is not smallest.");
        }
        else {
            System.out.println("First number is smallest.");
        }
        sc.close();
    }
}
