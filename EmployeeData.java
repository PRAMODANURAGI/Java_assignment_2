   //  Question 14  //

import java.util.Scanner;

class Employee {
    private int emp_id;
    private String emp_name;
    private double basic_salary;

    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }

    public double calculateGrossSalary() {
        // Assuming a simple calculation for demonstration
        double hra = 0.1 * basic_salary;
        double da = 0.05 * basic_salary;
        return basic_salary + hra + da;
    }

    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.next();

        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble();

        scanner.close();

        Employee employee = new Employee(emp_id, emp_name, basic_salary);
        employee.display();
    }
}