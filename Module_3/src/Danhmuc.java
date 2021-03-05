public class Danhmuc {
    protected String maDanhMuc,loai,moTa;

    public Danhmuc(String maDanhMuc, String loai, String moTa) {
        this.maDanhMuc = maDanhMuc;
        this.loai = loai;
        this.moTa = moTa;
    }

    public Danhmuc() {
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
