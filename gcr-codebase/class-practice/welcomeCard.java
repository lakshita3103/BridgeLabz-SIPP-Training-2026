import java.util.Scanner;

public class welcomeCard {

    String name;
    int age;
    int rank;
    long salary;
    float fee;
    int annual;

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: " + salary);
        System.out.println("Fee: " + fee);
        System.out.println("12% of Salary: " + annual);
    }

    public void calculateAnnual() {
        annual = (int)(salary * 12 / 100);
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        welcomeCard obj = new welcomeCard();

        System.out.print("Enter Name: ");
        obj.name = sc.nextLine();

        System.out.print("Enter Age: ");
        obj.age = sc.nextInt();

        System.out.print("Enter Rank: ");
        obj.rank = sc.nextInt();

        System.out.print("Enter Salary: ");
        obj.salary = sc.nextLong();

        System.out.print("Enter Fee: ");
        obj.fee = sc.nextFloat();
        sc.close();
    }
    

    public static void main(String[] args) {
        welcomeCard obj = new welcomeCard();
        obj.input();
        obj.calculateAnnual();
        obj.show();
    }
}