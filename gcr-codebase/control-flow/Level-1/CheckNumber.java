import java.util.*;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Positive.");
        }
        else if(num==0){
            System.out.println("Zero.");
        }
        else{
            System.out.println("Negative.   ");
        }
        sc.close();
    }
}
