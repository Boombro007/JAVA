import java.util.Scanner;

abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(String name, int employeeId, double annualSalary) {
        super(name, employeeId);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateSalary() {
        return annualSalary / 12.0;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Annual Salary for FullTime: ");
        double annualSalary = sc.nextDouble();
        System.out.print("Enter Hourly Rate for PartTime: ");
        double hourlyRate = sc.nextDouble();
        System.out.print("Enter Hours Worked for PartTime: ");
        int hours = sc.nextInt();

        Employee ft = new FullTimeEmployee(name, id, annualSalary);
        Employee pt = new PartTimeEmployee(name, id, hourlyRate, hours);

        System.out.println("\nFull-Time Monthly Salary: " + ft.calculateSalary());
        System.out.println("Part-Time Total Salary: " + pt.calculateSalary());
        sc.close();
    }
}