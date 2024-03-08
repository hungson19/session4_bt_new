package Bai5;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Show all students");//Hiển thị tất cả học sinh
            System.out.println("2. Add new student");//Thêm học sinh mới
            System.out.println("3. Edit student information by student ID");//Chỉnh sửa thông tin sinh viên theo mã sinh viên
            System.out.println("4. Delete student");//Xóa sv
            System.out.println("5. Exit");//Thoat
            System.out.print("Enter your choice: ");//nhap lua chon
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (studentCount == 0) {
                        System.out.println("No students to show.");
                    } else {
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println("\nStudent " + (i + 1) + ":");
                            students[i].displayData();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Adding a new student:");
                    students[studentCount] = new Student();
                    students[studentCount].inputData();
                    studentCount++;
                    break;
                case 3:
                    System.out.print("Enter student ID to edit: ");
                    String editID = scanner.next();
                    int editIndex = -1;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getStudentID().equals(editID)) {
                            editIndex = i;
                            break;
                        }
                    }
                    if (editIndex == -1) {
                        System.out.println("Student with ID " + editID + " not found.");
                    } else {
                        System.out.println("Editing student with ID " + editID + ":");
                        students[editIndex].inputData();
                    }
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    String deleteID = scanner.next();
                    int deleteIndex = -1;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getStudentID().equals(deleteID)) {
                            deleteIndex = i;
                            break;
                        }
                    }
                    if (deleteIndex == -1) {
                        System.out.println("Student with ID " + deleteID + " not found.");
                    } else {
                        for (int i = deleteIndex; i < studentCount - 1; i++) {
                            students[i] = students[i + 1];
                        }
                        studentCount--;
                        System.out.println("Student with ID " + deleteID + " deleted successfully.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}

