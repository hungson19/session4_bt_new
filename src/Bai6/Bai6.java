package Bai6;

import java.util.Scanner;



public class Bai6 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("001", "Son", 21, "Male", 3.0);
        employees[1] = new Employee("002", "Giang", 25, "Female", 2.0);
        employees[2] = new Employee("003", "Anh", 35, "Male", 1.8);
        employees[3] = new Employee("004", "Tu", 28, "Female", 1.6);
        employees[4] = new Employee("005", "Toan", 40, "Male", 1.7);

        for (Employee employee : employees) {
            employee.calSalary();
            employee.displayData();
            System.out.println();
        }
    }
}

