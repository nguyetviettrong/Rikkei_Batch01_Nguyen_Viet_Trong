import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class khachHang {
    protected String maKh,hoTen,email,loaiKh;
    protected int sdt;
    protected Date ngaySinh;

    public khachHang(String maKh, String hoTen, String email, String loaiKh, int sdt, Date ngaySinh) {
        this.maKh = maKh;
        this.hoTen = hoTen;
        this.email = email;
        this.loaiKh = loaiKh;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "khachHang{" +
                "maKh='" + maKh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", email='" + email + '\'' +
                ", loaiKh='" + loaiKh + '\'' +
                ", sdt=" + sdt +
                ", ngaySinh=" + ngaySinh +
                '}';
    }

    public khachHang() {
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKh() {
        return loaiKh;
    }

    public void setLoaiKh(String loaiKh) {
        this.loaiKh = loaiKh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public void Them(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        maKh = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        sdt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap emmail: ");
        email = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        String ngaysinhstr= sc.nextLine();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try{
            ngaySinh = date.parse(ngaysinhstr);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
