import java.util.*;
public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println(false); 
        }
        while(n>1){
            if(n%2==0){
                n/=2;
            }
            else if(n%3==0){
                n/=3;
            }
            else if(n%5==0){
                n/=5;
            }
            else{
                System.out.println(false); 
            }
        }
        System.out.println(true);
        sc.close(); 
    }
}
