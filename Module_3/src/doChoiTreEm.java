import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class doChoiTreEm extends SanPham{
    protected String xuatSu,thuongHieu,nhaCungCap,huongDanSuDung;
    ArrayList<doChoiTreEm> dochoilist = new ArrayList<>();
    public doChoiTreEm() {
    }

    @Override
    public String toString() {
        return "doChoiTreEm{" +
                "maSp='" + maSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", thuocDm='" + thuocDm + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", xuatSu='" + xuatSu + '\'' +
                ", thuongHieu='" + thuongHieu + '\'' +
                ", nhaCungCap='" + nhaCungCap + '\'' +
                ", huongDanSuDung='" + huongDanSuDung + '\'' +
                '}';
    }

    public doChoiTreEm(String maSp, String tenSp, String thuocDm, int soLuong, int donGia, String xuatSu, String thuongHieu, String nhaCungCap, String huongDanSuDung) {
        super(maSp, tenSp, thuocDm, soLuong, donGia);
        this.xuatSu = xuatSu;
        this.thuongHieu = thuongHieu;
        this.nhaCungCap = nhaCungCap;
        this.huongDanSuDung = huongDanSuDung;
    }

    public doChoiTreEm(String xuatSu, String thuongHieu, String nhaCungCap, String huongDanSuDung) {
        this.xuatSu = xuatSu;
        this.thuongHieu = thuongHieu;
        this.nhaCungCap = nhaCungCap;
        this.huongDanSuDung = huongDanSuDung;
    }

    public String getXuatSu() {
        return xuatSu;
    }

    public void setXuatSu(String xuatSu) {
        this.xuatSu = xuatSu;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getHuongDanSuDung() {
        return huongDanSuDung;
    }

    public void setHuongDanSuDung(String huongDanSuDung) {
        this.huongDanSuDung = huongDanSuDung;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(dochoilist);
    }
    @Override
    public double phanTramGiamGia(String loaiKh) {
        switch (loaiKh){
            case "thuong":
                return 0.02;
            case "vip1":
                return 0.05;
            case "vip2":
                return 0.07;
        }
        return 0;
    }
    public void ThemMoiDoChoi(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ma san pham: ");
        maSp = sc.nextLine();
        System.out.println("Ten san pham: ");
        tenSp = sc.nextLine();
        System.out.println("So luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Don gia: ");
        donGia =Integer.parseInt(sc.nextLine());
        System.out.println("Thuoc danh muc: ");
        thuocDm = sc.nextLine();
        System.out.println("Xuat xu: ");
        xuatSu = sc.nextLine();
        System.out.println("Thuong hieu: ");
        thuongHieu = sc.nextLine();
        System.out.println("Nha cung cap: ");
        nhaCungCap = sc.nextLine();
        System.out.println("Huong dan su dung: ");
        huongDanSuDung = sc.nextLine();
        doChoiTreEm toy = new doChoiTreEm(maSp,tenSp,thuocDm,soLuong,donGia,xuatSu,thuongHieu,nhaCungCap,huongDanSuDung);
        dochoilist.add(toy) ;
    }
    public void Ghi(){
        String File= "D:\\Module_3\\src\\csv\\Dochoitreem.csv";
        try{
            java.io.File file = new File(File);
            if (file.createNewFile()){
                System.out.println("tao moi file");
            }
            FileWriter fileWriter = new FileWriter(File);
            fileWriter.write(this.toString());
            fileWriter.close();
            System.out.println("Đã ghi");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
