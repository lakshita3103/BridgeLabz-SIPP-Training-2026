import java.util.*;
public class Max69Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = sc.nextInt();
        int temp = num;
        int place =1;
        int changeplace =0;
        while(temp>0){
            if(temp%10 == 6){
                changeplace = place;
            }
            temp /= 10;
            place *= 10;
        }
        System.out.println(num + 3* changeplace);
        sc.close();
        
    }
}
