import java.util.*;
public class converion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Celsius: ");
        int celsius = sc.nextInt();
        System.out.println(CelsiusToFahreheit(celsius));
        sc.close();
    }
    public static int CelsiusToFahreheit(int celsius){
        int fahrenheit = (celsius*9/5) + 32;
        return fahrenheit;
    }
}
