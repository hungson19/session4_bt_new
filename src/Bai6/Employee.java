package Bai6;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, String gender, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        this.employeeId = scanner.nextLine();
        System.out.println("Enter employee name: ");
        this.employeeName = scanner.nextLine();
        System.out.println("Enter employee age: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter employee gender: ");
        this.gender = scanner.nextLine();
        System.out.println("Enter employee rate: ");
        this.rate = scanner.nextDouble();
    }

    public void displayData() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Gender: " + gender);
        System.out.println("Employee Rate: " + rate);
        System.out.println("Employee Salary: " + salary);
    }

    public void calSalary() {
        salary = rate * 1300000;
    }
}
