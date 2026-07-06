import java.util.*;

class Employee {
    int id;
    int attendance;

    Employee(int id, int attendance) {
        this.id = id;
        this.attendance = attendance;
    }
}

public class EmployeeAttendanceRanking {

    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {

        int n = employeeIds.length;

        Employee[] employees = new Employee[n];

        // Store employee data
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }

        // Sort employees
        Arrays.sort(employees, (a, b) -> {

            // Higher attendance first
            if (a.attendance != b.attendance)
                return b.attendance - a.attendance;

            // Smaller ID first if attendance is same
            return a.id - b.id;
        });

        // Store top K employee IDs
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = employees[i].id;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] employeeIds = new int[n];
        int[] attendance = new int[n];

        System.out.println("Enter Employee IDs:");
        for (int i = 0; i < n; i++) {
            employeeIds[i] = sc.nextInt();
        }

        System.out.println("Enter Attendance Percentages:");
        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int[] result = topKEmployees(employeeIds, attendance, k);

        System.out.println("Top " + k + " Employees:");

        for (int id : result) {
            System.out.print(id + " ");
        }

        sc.close();
    }
}