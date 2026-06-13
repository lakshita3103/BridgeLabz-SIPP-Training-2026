import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.println(addTwo(num1, num2));
        sc.close();
    }
    public static int addTwo(int num1, int num2){
        int ans = num1+ num2;
        return ans;
    }
}
