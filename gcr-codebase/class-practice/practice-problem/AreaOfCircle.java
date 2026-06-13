import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextInt();
        System.out.println(area(radius));
        sc.close();
    }
    public static double area(double radius){
        double area = 3.17 * (Math.pow(radius, 2));
        return area;

    }
}
