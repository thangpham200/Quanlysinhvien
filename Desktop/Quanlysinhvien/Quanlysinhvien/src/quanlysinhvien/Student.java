
package quanlysinhvien;

public class Student {
    // 1. Các thuộc tính (Attributes)
    private String maSV;
    private String hoTen;
    private double diemTB;

    // 2. Hàm khởi tạo không tham số (Default Constructor)
    public Student() {
    }

    // 3. Hàm khởi tạo có tham số (Parameterized Constructor)
    public Student(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    // 4. Các phương thức Getter và Setter
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    // 5. Phương thức xếp loại học lực
    public String xepLoai() {
        if (this.diemTB >= 8.0) {
            return "Giỏi";
        } else if (this.diemTB >= 6.5) {
            return "Khá";
        } else if (this.diemTB >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    // 6. Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã SV: " + maSV + " | Họ tên: " + hoTen + " | Điểm TB: " + diemTB + " | Xếp loại: " + xepLoai());
    }
}
  

    

