public abstract class SanPham {
    protected String maSp,tenSp,thuocDm;
    protected int soLuong,donGia;
    public abstract void hienThiThongTin();
    public abstract double phanTramGiamGia(String loaiKh);

    public SanPham(String maSp, String tenSp, String thuocDm, int soLuong, int donGia) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.thuocDm = thuocDm;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public SanPham() {
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getThuocDm() {
        return thuocDm;
    }

    public void setThuocDm(String thuocDm) {
        this.thuocDm = thuocDm;
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
}
