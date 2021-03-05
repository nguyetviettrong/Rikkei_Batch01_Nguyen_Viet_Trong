import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class dungCuHocTap extends SanPham{
    protected String xuatSu,thuongHieu,nhaCungCap,huongDanSuDung,mauSac,chatLieu;
    protected Float kichThuoc;
    ArrayList<dungCuHocTap> dungculist = new ArrayList<>();
    public dungCuHocTap() {
    }

    @Override
    public String toString() {
        return "dungCuHocTap{" +
                "maSp='" + maSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", thuocDm='" + thuocDm + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", xuatSu='" + xuatSu + '\'' +
                ", thuongHieu='" + thuongHieu + '\'' +
                ", nhaCungCap='" + nhaCungCap + '\'' +
                ", huongDanSuDung='" + huongDanSuDung + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", chatLieu='" + chatLieu + '\'' +
                ", kichThuoc='" + kichThuoc + '\'' +
                '}';
    }

    public dungCuHocTap(String maSp, String tenSp, String thuocDm, int soLuong, int donGia, String xuatSu, String thuongHieu, String nhaCungCap, String huongDanSuDung, String mauSac, String chatLieu, Float kichThuoc) {
        super(maSp, tenSp, thuocDm, soLuong, donGia);
        this.xuatSu = xuatSu;
        this.thuongHieu = thuongHieu;
        this.nhaCungCap = nhaCungCap;
        this.huongDanSuDung = huongDanSuDung;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.kichThuoc = kichThuoc;
    }

    public dungCuHocTap(String xuatSu, String thuongHieu, String nhaCungCap, String huongDanSuDung, String mauSac, String chatLieu, Float kichThuoc) {
        this.xuatSu = xuatSu;
        this.thuongHieu = thuongHieu;
        this.nhaCungCap = nhaCungCap;
        this.huongDanSuDung = huongDanSuDung;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.kichThuoc = kichThuoc;
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

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public Float getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(Float kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(dungculist);
    }

    @Override
    public double phanTramGiamGia(String loaiKh) {
        switch (loaiKh){
            case "thuong":
                return 0.01;
            case "vip1":
                return 0.03;
            case "vip2":
                return 0.07;
        }
        return 0;
    }
    public void DoDungHocTap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ma san pham: ");
        maSp = sc.nextLine();
        System.out.println("Ten san pham: ");
        tenSp = sc.nextLine();
        System.out.println("So luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Don gia: ");
        donGia = Integer.parseInt(sc.nextLine());
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
        System.out.println("Mau sac: ");
        mauSac = sc.nextLine();
        System.out.println("Chat lieu: ");
        chatLieu = sc.nextLine();
        System.out.println("Kich thuoc: ");
        kichThuoc = Float.parseFloat(sc.nextLine());
        dungCuHocTap tool = new dungCuHocTap(maSp,tenSp,thuocDm,soLuong,donGia,xuatSu,thuongHieu,nhaCungCap,huongDanSuDung,mauSac,chatLieu,kichThuoc);
        dungculist.add(tool);
    }
    public void Ghi(){
        String File= "D:\\Module_3\\src\\csv\\Dodunghoctap.csv";
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
