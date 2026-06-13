import java.util.*;
public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int len = sc.nextInt();
        System.out.print("Enter the width: ");
        int wid = sc.nextInt();
        System.out.println(rectangle(len, wid));
        sc.close();
    }
    public static int rectangle(int len, int wid){
        int peri = 2*(len+wid);
        return peri;
    }
}
