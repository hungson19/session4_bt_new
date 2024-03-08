package Bai1;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double chuVi() {
        return 2 * Math.PI * radius;
    }

    public double dienTich() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        this.radius = scanner.nextDouble();
        scanner.nextLine(); // Đọc ký tự new line
        System.out.print("Nhập màu sắc: ");
        this.color = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Bán kính: " + radius);
        System.out.println("Màu sắc: " + color);
        System.out.println("Chu vi: " + chuVi());
        System.out.println("Diện tích: " + dienTich());
    }
}



