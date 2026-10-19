
package quanlysinhvien;

import java.util.Scanner;

public class Quanlysinhvien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tạo mảng chứa 3 sinh viên
        Student[] danhSachSV = new Student[3];
        
        System.out.println("=== NHẬP THÔNG TIN 3 SINH VIÊN ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Nhập thông tin cho sinh viên thứ " + (i + 1) + " ---");
            Student sv = new Student();
            
            System.out.print("Nhập mã sinh viên: ");
            sv.setMaSV(scanner.nextLine());
            
            System.out.print("Nhập họ tên sinh viên: ");
            sv.setHoTen(scanner.nextLine());
            
            System.out.print("Nhập điểm trung bình: ");
            sv.setDiemTB(scanner.nextDouble());
            scanner.nextLine(); // Xóa bộ nhớ đệm chống trôi lệnh
            
            // Lưu đối tượng sinh viên vào mảng
            danhSachSV[i] = sv;
        }
        
        System.out.println("\n========================================");
        System.out.println("=== DANH SÁCH KẾT QUẢ CÁC SINH VIÊN ===");
        for (int i = 0; i < 3; i++) {
            System.out.print("SV " + (i + 1) + " -> ");
            danhSachSV[i].hienThiThongTin();
          

        }
        System.out.println("\n=== HOAN THANH NHAP DU LIEU ===");

    }  
}   
    