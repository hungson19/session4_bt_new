package Bai5;

import java.util.Scanner;

public class Student {
    private String studentID;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(String studentID, String name, int age, String gender, String address, String phoneNumber) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        this.studentID = scanner.nextLine();
        System.out.println("Enter student name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter student age: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter student gender: ");
        this.gender = scanner.nextLine();
        System.out.println("Enter student address: ");
        this.address = scanner.nextLine();
        System.out.println("Enter student phone number: ");
        this.phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Gender: " + gender);
        System.out.println("Student Address: " + address);
        System.out.println("Student Phone Number: " + phoneNumber);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

