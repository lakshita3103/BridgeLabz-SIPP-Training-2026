import java.util.*;
public class calulateInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        double principle = sc.nextInt();
        System.out.print("Enter the Rate: ");
        double rate = sc.nextInt();
        System.out.print("Enter the Time: ");
        double time = sc.nextInt();
        System.out.println(SimpleInterest(principle, rate, time));
        sc.close();
    }
    public static double SimpleInterest(double principle, double rate , double time){
        double si = ((principle*rate)*time)/100;
        return si;
    }
}
