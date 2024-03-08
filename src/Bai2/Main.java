package Bai2;

import java.util.Scanner;

class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0)
            return 0; // No real roots
        else
            return (-b + Math.pow(discriminant, 0.5)) / (2 * a);
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0)
            return 0; // No real roots
        else
            return (-b - Math.pow(discriminant, 0.5)) / (2 * a);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values of a, b, and c:");//Nhập các giá trị của a, b và c
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("The equation has two roots: " + root1 + " and " + root2);//Phương trình có hai nghiệm:
        } else if (discriminant == 0) {
            double root = equation.getRoot1(); // or equation.getRoot2(), they're equal
            System.out.println("The equation has one root: " + root);//Phương trình có một nghiệm:
        } else {
            System.out.println("The equation has no roots");//Phương trình không có
        }

        scanner.close();
    }
}

