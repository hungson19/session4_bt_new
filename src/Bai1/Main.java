package Bai1;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo một đối tượng Circle
        Circle circle = new Circle();

        // Nhập dữ liệu từ người dùng
        circle.inputData();

        // Hiển thị thông tin
        System.out.println("\nThông tin hình tròn:");
        circle.displayData();
    }
}
