import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class sach extends SanPham{
    protected String nhaXuatBan,tacGia,lanTaiBan;
    protected int namXuatBan;
    protected Date ngayXuatBan;
    ArrayList<sach> sachlist = new ArrayList<>();
    public sach() {
    }

    @Override
    public String toString() {
        return "sach{" +
                "maSp='" + maSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", thuocDm='" + thuocDm + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", lanTaiBan='" + lanTaiBan + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", ngayXuatBan=" + ngayXuatBan +
                '}';
    }

    public sach(String maSp, String tenSp, String thuocDm, int soLuong, int donGia, String nhaXuatBan, String tacGia, String lanTaiBan, int namXuatBan, Date ngayXuatBan) {
        super(maSp, tenSp, thuocDm, soLuong, donGia);
        this.nhaXuatBan = nhaXuatBan;
        this.tacGia = tacGia;
        this.lanTaiBan = lanTaiBan;
        this.namXuatBan = namXuatBan;
        this.ngayXuatBan = ngayXuatBan;
    }

    public sach(String nhaXuatBan, String tacGia, String lanTaiBan, int namXuatBan, Date ngayXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
        this.tacGia = tacGia;
        this.lanTaiBan = lanTaiBan;
        this.namXuatBan = namXuatBan;
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getLanTaiBan() {
        return lanTaiBan;
    }

    public void setLanTaiBan(String lanTaiBan) {
        this.lanTaiBan = lanTaiBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public Date getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(Date ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }
    @Override
    public void hienThiThongTin() {
        System.out.println(sachlist);
    }
    @Override
    public double phanTramGiamGia(String loaiKh) {
        switch (loaiKh){
            case "thuong":
                return 0.02;
            case "vip1":
                return 0.05;
            case "vip2":
                return 0.1;
        }
        return 0;
    }
    public void ThemMoiSach(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ma san pham: ");
        maSp = sc.nextLine();
        System.out.println("Ten san pham: ");
        tenSp = sc.nextLine();
        System.out.println("Thuoc danh muc: ");
        thuocDm = sc.nextLine();
        System.out.println("So luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Don gia: ");
        donGia = Integer.parseInt(sc.nextLine());
        System.out.println("Nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        do{
            System.out.println("Nam xuat ban: ");
            namXuatBan = Integer.parseInt(sc.nextLine());
            if (namXuatBan<1000||namXuatBan>2999)
                System.out.println("Sai nam");
        }while (namXuatBan<1000||namXuatBan>2999);
        System.out.println("Tac gia: ");
        tacGia = sc.nextLine();
        System.out.println("Ngay xuat ban: ");
        String ngayXuatBanStr = sc.nextLine();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try{
            ngayXuatBan = date.parse(ngayXuatBanStr);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Lan tai ban: ");
        lanTaiBan = sc.nextLine();
        sach book = new sach(maSp,tenSp,thuocDm,soLuong,donGia,nhaXuatBan,tacGia,lanTaiBan,namXuatBan,ngayXuatBan);
        sachlist.add(book);
    }
    public void Ghi(){
        String File= "D:\\Module_3\\src\\csv\\Sach.csv";
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
