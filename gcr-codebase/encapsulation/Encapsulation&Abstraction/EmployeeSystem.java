abstract class Employee {
    private int employeeId;
    private String employeeName;

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    // Setters
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class
public class EmployeeSystem {
    public static void main(String[] args) {

        // Full-time employee
        FullTimeEmployee emp1 = new FullTimeEmployee();
        emp1.setEmployeeId(101);
        emp1.setEmployeeName("Rahul");
        emp1.setMonthlySalary(50000);

        System.out.println("Full-Time Employee");
        emp1.displayEmployeeInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println();

        // Part-time employee
        PartTimeEmployee emp2 = new PartTimeEmployee();
        emp2.setEmployeeId(102);
        emp2.setEmployeeName("Priya");
        emp2.setHoursWorked(80);
        emp2.setHourlyRate(400);

        System.out.println("Part-Time Employee");
        emp2.displayEmployeeInfo();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}