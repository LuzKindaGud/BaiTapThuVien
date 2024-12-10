public class Sach {
    private int maSach;
    private String tieuDe;
    private String tacGia;
    private String theLoai;
    private int namXuatBan;
    private String trangThai; // "Đang mượn" hoặc "Sẵn sàng"

    public Sach(int maSach, String tieuDe, String tacGia, String theLoai, int namXuatBan, String trangThai) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.namXuatBan = namXuatBan;
        this.trangThai = trangThai;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Sách [" + "Mã Sách:" + maSach + ", Tiêu Đề:'" + tieuDe + '\'' + ", Tác Giả:'" + tacGia + '\'' + ", Thể Loại:'" + theLoai + '\'' + ", Năm Xuất Bản:" + namXuatBan + ", Trạng Thái:'" + trangThai + '\'' + "]";
    }
}