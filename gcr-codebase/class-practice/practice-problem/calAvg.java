import java.util.*;
public class calAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        System.out.println(CalAvgerage(num1, num2, num3));
        sc.close();
    }
    public static int CalAvgerage(int num1, int num2, int num3){
        int avg = (num1+num2+num3)/3;
        return avg;
    }
}
