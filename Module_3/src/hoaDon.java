import java.util.Date;

public class hoaDon {
    protected String maHd,maKh,maSp;
    protected int soLuong,donGia;
    protected Date ngayMua;

    public hoaDon() {
    }

    public hoaDon(String maHd, String maKh, String maSp, int soLuong, int donGia, Date ngayMua) {
        this.maHd = maHd;
        this.maKh = maKh;
        this.maSp = maSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngayMua = ngayMua;
    }

    public String getMaHd() {
        return maHd;
    }

    public void setMaHd(String maHd) {
        this.maHd = maHd;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

}
