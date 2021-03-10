package rikkei_trong.com.demo.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="khachhang")

public class khachhangEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MaKhachHang;
    private String TenKhachHang;
    private Date NgaySinh;
    private int SoDienThoai;
    private String Email;

    public khachhangEntity() {
    }

    public khachhangEntity(String maKhachHang, String tenKhachHang, Date ngaySinh, int soDienThoai, String email) {
        MaKhachHang = maKhachHang;
        TenKhachHang = tenKhachHang;
        NgaySinh = ngaySinh;
        SoDienThoai = soDienThoai;
        Email = email;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public int getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
