import java.util.*;
public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextInt();
        System.out.print("Enter the height: ");
        double height = sc.nextInt();
        System.out.println(volume(radius, height));
        sc.close();
    }
    public static double volume(double radius, double height){
        double volume = 3.17 *(Math.pow(radius, height)) * height;
        return volume;
    }
}
