/*Ravi just joined a coding guild. Store his name, age, rank, salary, and
membership fee (float) using correct data types. Compute his
annual bonus (12% of salary), cast it to int, and print a formatted
welcome card.*/


import java.util.Scanner;

public class welcomeCard {

    String name;
    int age;
    int rank;
    long salary;
    float fee;
    int annual;

    void show() {
        System.out.println("\n===== WELCOME CARD =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: " + salary);
        System.out.println("Fee: " + fee);
        System.out.println("12% of Salary: " + annual);
    }

    void calculateAnnual() {
        annual = (int) (salary * 12 / 100);
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Rank: ");
        rank = sc.nextInt();

        System.out.print("Enter Salary: ");
        salary = sc.nextLong();

        System.out.print("Enter Fee: ");
        fee = sc.nextFloat();

        sc.close();
    }

    public static void main(String[] args) {
        welcomeCard obj = new welcomeCard();

        obj.input();
        obj.calculateAnnual();
        obj.show();
    }
}